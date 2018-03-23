package com.dfj;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;

/**
 * 
 * @author dfj
 * Fri Jul 21 16:58:37 CST 2017 dfj
 *实体生成器
 */
public class BuildClass {

	
    private String packageOutPath = "com.dfj.entity";//指定实体生成所在包的路径
    private String authorName = "dfj";//作者名字
    private String tablename = "";//表名
    private String[] colnames; // 列名数组
    private String[] colTypes; //列名类型数组
    private int[] colSizes; //列名大小数组
    private boolean f_util = false; // 是否需要导入包java.util.*
    private boolean f_sql = false; // 是否需要导入包java.sql.*

    //数据库连接
    private static final String URL ="jdbc:mysql://127.0.0.1:3306/imslean";
    private static final String NAME = "root";
    private static final String PASS = "root";
    private static final String DRIVER ="com.mysql.jdbc.Driver";

    /*
     * 构造函数
     */
    public BuildClass(){}
    
    
    
    
    public void create(){
    	//创建连接
        Connection con = null;
        //查要生成实体类的表
        String sql = "select * from " + tablename;
        PreparedStatement pStemt = null;
        try {
            try {
                Class.forName(DRIVER);
            } catch (ClassNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            con = DriverManager.getConnection(URL,NAME,PASS);
            pStemt = con.prepareStatement(sql);
            ResultSetMetaData rsmd = pStemt.getMetaData();
            int size = rsmd.getColumnCount();   //统计列
            colnames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];
            for (int i = 0; i < size; i++) {
                colnames[i] = rsmd.getColumnName(i + 1);
                colTypes[i] = rsmd.getColumnTypeName(i + 1);

                if(colTypes[i].equalsIgnoreCase("datetime")||colTypes[i].equalsIgnoreCase("date")){
                    f_util = true;
                }
                if(colTypes[i].equalsIgnoreCase("image") || colTypes[i].equalsIgnoreCase("text")||colTypes[i].equalsIgnoreCase("timestamp")){
                    f_sql = true;
                }
                colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
            }

            String content = parse(colnames,colTypes,colSizes);

            try {
                File directory = new File("");
                //System.out.println("绝对路径："+directory.getAbsolutePath());
                //System.out.println("相对路径："+directory.getCanonicalPath());
                String path=this.getClass().getResource("").getPath();

                System.out.println(path);
                System.out.println("src/?/"+path.substring(path.lastIndexOf("/com/", path.length())) );
//	              String outputPath = directory.getAbsolutePath()+ "/src/"+path.substring(path.lastIndexOf("/com/", path.length()), path.length()) + initcap(tablename) + ".java";
                String outputPath = directory.getAbsolutePath()+ "/src/"+this.packageOutPath.replace(".", "/")+"/"+initcap(tablename) + ".java";
                FileWriter fw = new FileWriter(outputPath);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(content);
                pw.flush();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
	          try {
	              con.close();
	          } catch (SQLException e) {
	              // TODO Auto-generated catch block
	              e.printStackTrace();
	          }
        }
    }
    /**
     * 功能：生成实体类主体代码
     * @param colnames
     * @param colTypes
     * @param colSizes
     * @return
     */
    private String parse(String[] colnames, String[] colTypes, int[] colSizes) {
        StringBuffer sb = new StringBuffer();

        sb.append("package " + this.packageOutPath + ";\r\n");
     //   sb.append("import "+this.packageOutPath+".BasicDataObjectImpl;\r\n");
        sb.append("import com.tiansu.eam.common.persistence.DataEntity;\r\n");
        //判断是否导入工具包
        if(f_util){
            sb.append("import java.util.Date;\r\n");
        }
        if(f_sql){
            sb.append("import java.sql.*;\r\n");
        }
        sb.append("\r\n");
        //注释部分
        sb.append("   /**\r\n");
        sb.append("    * "+tablename+" 实体类\r\n");
        sb.append("    * "+new Date()+" "+this.authorName+"\r\n");
        sb.append("    */ \r\n");
        //实体部分
        //sb.append("\r\n\r\npublic class " + initcap(tablename) +" extends BasicDataObjectImpl"+ "{\r\n ");
        sb.append("\r\n\r\npublic class " + initcap(tablename) +" extends  DataEntity<"+initcap(tablename)+"> "+ "{\r\n ");
        processAllAttrs(sb);//属性
        processAllMethod(sb);//get set方法
        sb.append("}\r\n");

        //System.out.println(sb.toString());
        return sb.toString();
    }

    /**
     * 功能：生成所有属性
     * @param sb
     */
    private void processAllAttrs(StringBuffer sb) {

        for (int i = 0; i < colnames.length; i++) {
            sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + colnames[i] + ";\r\n");
        }

    }

    /**
     * 功能：生成所有方法
     * @param sb
     */
    private void processAllMethod(StringBuffer sb) {

        for (int i = 0; i < colnames.length; i++) {
            sb.append("\tpublic void set" + initcap(colnames[i]) + "(" + sqlType2JavaType(colTypes[i]) + " " +
                    colnames[i] + "){\r\n");
            sb.append("\t\tthis." + colnames[i] + "=" + colnames[i] + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + initcap(colnames[i]) + "(){\r\n");
            sb.append("\t\treturn " + colnames[i] + ";\r\n");
            sb.append("\t}\r\n");
        }

    }

    /**
     * 功能：将输入字符串的首字母改成大写
     * @param str
     * @return
     */
    private static String initcap(String str) {
    	int[] num=new int[str.length()];
        char[] ch = str.toCharArray();
        if(ch[0] >= 'a' && ch[0] <= 'z'){
            ch[0] = (char)(ch[0] - 32);
        }
        for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='_') {
				num[i]=i+1;
				 if(ch[num[i]] >= 'a' && ch[num[i]] <= 'z'){
			            ch[num[i]] = (char)(ch[num[i]] - 32);
			        }
			}
			
		}
       
        String newStr=new String(ch).replaceAll("_", "");
        return newStr;
    }

    /**
     * 功能：获得列的数据类型
     * @param sqlType
     * @return
     */
    private String sqlType2JavaType(String sqlType) {

        if(sqlType.equalsIgnoreCase("bit")){
            return "boolean";
        }else if(sqlType.equalsIgnoreCase("tinyint")){
            return "byte";
        }else if(sqlType.equalsIgnoreCase("smallint")){
            return "short";
        }else if(sqlType.equalsIgnoreCase("int")){
            return "Integer";
        }else if(sqlType.equalsIgnoreCase("bigint")){
            return "long";
        }else if(sqlType.equalsIgnoreCase("float")){
            return "float";
        }else if(sqlType.equalsIgnoreCase("decimal") || sqlType.equalsIgnoreCase("numeric")
                || sqlType.equalsIgnoreCase("real") || sqlType.equalsIgnoreCase("money")
                || sqlType.equalsIgnoreCase("smallmoney")){
            return "Double";
        }else if(sqlType.equalsIgnoreCase("varchar") || sqlType.equalsIgnoreCase("char")
                || sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nchar")
            || sqlType.equalsIgnoreCase("text")){
           return "String";
        }else if(sqlType.equalsIgnoreCase("date")){
       	 	return "Date";
        }else if(sqlType.equalsIgnoreCase("datetime")){
            return "Date";
        }else if(sqlType.equalsIgnoreCase("timestamp")){
            return "Timestamp";
        }else if(sqlType.equalsIgnoreCase("image")){
            return "Blod";
        }
        

        return null;
    }
    /**
     * 出口
     * TODO
     * @param args
     */
    public static void main(String[] args) {
    	BuildClass bc=new BuildClass();
    	/*String[] tableNames=new String[]{"ts_customer","ts_material",
    			"ts_material_type","ts_supplier","ts_dev_category",
    			"ts_dev_location","ts_device","ts_operation_library",
    			"ts_operation_device","ts_fault_standard","ts_maintain_standard",
    			"ts_patrol_standard","ts_failure_standard","ts_operation_standard",
    			"ts_safety_standard","org_employee"};*/
    	String[] tableNames=new String[]{"cm_enumval","cm_enumtype","cm_attribute"};
       for (int i = 0; i < tableNames.length; i++) {
    	   bc.tablename=tableNames[i];
    	   bc.create();
       }

    }

}
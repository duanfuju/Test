package com.nrims.imslean.user.entity.system;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class SysOrgBusidept extends ShareField implements Serializable {
 	private String bd_id;
	private String bd_name;
	private String sos_id;
	private String businessdomain_id;
	private String bd_pid;
	private String bd_uid;
	private String bc_id;
	private String dim_id;
	private String attr_id;
	private String bd_shortname;
	private String bd_code;
	private String bd_pathcode;
	private String bd_unicode;
	private String bd_relation;
	private String bd_retractdate;
	private String bd_founddate;
	private String bd_state;
	private Integer bd_level;
	private String bd_isleaf;
	private String bd_remark;
	private Integer bd_orderno;
	private String bd_orgpath;
	public void setBdId(String bd_id){
		this.bd_id=bd_id;
	}
	public String getBdId(){
		return bd_id;
	}
	public void setBdName(String bd_name){
		this.bd_name=bd_name;
	}
	public String getBdName(){
		return bd_name;
	}
	public void setSosId(String sos_id){
		this.sos_id=sos_id;
	}
	public String getSosId(){
		return sos_id;
	}
	public void setBusinessdomainId(String businessdomain_id){
		this.businessdomain_id=businessdomain_id;
	}
	public String getBusinessdomainId(){
		return businessdomain_id;
	}
	public void setBdPid(String bd_pid){
		this.bd_pid=bd_pid;
	}
	public String getBdPid(){
		return bd_pid;
	}
	public void setBdUid(String bd_uid){
		this.bd_uid=bd_uid;
	}
	public String getBdUid(){
		return bd_uid;
	}
	public void setBcId(String bc_id){
		this.bc_id=bc_id;
	}
	public String getBcId(){
		return bc_id;
	}
	public void setDimId(String dim_id){
		this.dim_id=dim_id;
	}
	public String getDimId(){
		return dim_id;
	}
	public void setAttrId(String attr_id){
		this.attr_id=attr_id;
	}
	public String getAttrId(){
		return attr_id;
	}
	public void setBdShortname(String bd_shortname){
		this.bd_shortname=bd_shortname;
	}
	public String getBdShortname(){
		return bd_shortname;
	}
	public void setBdCode(String bd_code){
		this.bd_code=bd_code;
	}
	public String getBdCode(){
		return bd_code;
	}
	public void setBdPathcode(String bd_pathcode){
		this.bd_pathcode=bd_pathcode;
	}
	public String getBdPathcode(){
		return bd_pathcode;
	}
	public void setBdUnicode(String bd_unicode){
		this.bd_unicode=bd_unicode;
	}
	public String getBdUnicode(){
		return bd_unicode;
	}
	public void setBdRelation(String bd_relation){
		this.bd_relation=bd_relation;
	}
	public String getBdRelation(){
		return bd_relation;
	}
	public void setBdRetractdate(String bd_retractdate){
		this.bd_retractdate=bd_retractdate;
	}
	public String getBdRetractdate(){
		return bd_retractdate;
	}
	public void setBdFounddate(String bd_founddate){
		this.bd_founddate=bd_founddate;
	}
	public String getBdFounddate(){
		return bd_founddate;
	}
	public void setBdState(String bd_state){
		this.bd_state=bd_state;
	}
	public String getBdState(){
		return bd_state;
	}
	public void setBdLevel(Integer bd_level){
		this.bd_level=bd_level;
	}
	public Integer getBdLevel(){
		return bd_level;
	}
	public void setBdIsleaf(String bd_isleaf){
		this.bd_isleaf=bd_isleaf;
	}
	public String getBdIsleaf(){
		return bd_isleaf;
	}
	public void setBdRemark(String bd_remark){
		this.bd_remark=bd_remark;
	}
	public String getBdRemark(){
		return bd_remark;
	}
	public void setBdOrderno(Integer bd_orderno){
		this.bd_orderno=bd_orderno;
	}
	public Integer getBdOrderno(){
		return bd_orderno;
	}
	public void setBdOrgpath(String bd_orgpath){
		this.bd_orgpath=bd_orgpath;
	}
	public String getBdOrgpath(){
		return bd_orgpath;
	}
}


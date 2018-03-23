package com.nrims.imslean.user.entity.system;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class SysOrgBusicorp extends ShareField implements Serializable {
 	private String bc_id;
	private String bc_name;
	private String sos_id;
	private String businessdomain_id;
	private String bc_pid;
	private String bc_uid;
	private String bg_id;
	private String bcclass_id;
	private String bg_selfid;
	private String dim_id;
	private String attr_id;
	private String bc_shortname;
	private String bc_veryshortname;
	private String bc_code;
	private String bc_pathcode;
	private String bc_unicode;
	private String bc_relation;
	private String bc_retractdate;
	private String bc_founddate;
	private String bc_state;
	private Integer bc_level;
	private String bc_isleaf;
	private String bc_remark;
	private Integer bc_orderno;
	private String bc_orgpath;
	private String under_disaster_flag;
	public void setBcId(String bc_id){
		this.bc_id=bc_id;
	}
	public String getBcId(){
		return bc_id;
	}
	public void setBcName(String bc_name){
		this.bc_name=bc_name;
	}
	public String getBcName(){
		return bc_name;
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
	public void setBcPid(String bc_pid){
		this.bc_pid=bc_pid;
	}
	public String getBcPid(){
		return bc_pid;
	}
	public void setBcUid(String bc_uid){
		this.bc_uid=bc_uid;
	}
	public String getBcUid(){
		return bc_uid;
	}
	public void setBgId(String bg_id){
		this.bg_id=bg_id;
	}
	public String getBgId(){
		return bg_id;
	}
	public void setBcclassId(String bcclass_id){
		this.bcclass_id=bcclass_id;
	}
	public String getBcclassId(){
		return bcclass_id;
	}
	public void setBgSelfid(String bg_selfid){
		this.bg_selfid=bg_selfid;
	}
	public String getBgSelfid(){
		return bg_selfid;
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
	public void setBcShortname(String bc_shortname){
		this.bc_shortname=bc_shortname;
	}
	public String getBcShortname(){
		return bc_shortname;
	}
	public void setBcVeryshortname(String bc_veryshortname){
		this.bc_veryshortname=bc_veryshortname;
	}
	public String getBcVeryshortname(){
		return bc_veryshortname;
	}
	public void setBcCode(String bc_code){
		this.bc_code=bc_code;
	}
	public String getBcCode(){
		return bc_code;
	}
	public void setBcPathcode(String bc_pathcode){
		this.bc_pathcode=bc_pathcode;
	}
	public String getBcPathcode(){
		return bc_pathcode;
	}
	public void setBcUnicode(String bc_unicode){
		this.bc_unicode=bc_unicode;
	}
	public String getBcUnicode(){
		return bc_unicode;
	}
	public void setBcRelation(String bc_relation){
		this.bc_relation=bc_relation;
	}
	public String getBcRelation(){
		return bc_relation;
	}
	public void setBcRetractdate(String bc_retractdate){
		this.bc_retractdate=bc_retractdate;
	}
	public String getBcRetractdate(){
		return bc_retractdate;
	}
	public void setBcFounddate(String bc_founddate){
		this.bc_founddate=bc_founddate;
	}
	public String getBcFounddate(){
		return bc_founddate;
	}
	public void setBcState(String bc_state){
		this.bc_state=bc_state;
	}
	public String getBcState(){
		return bc_state;
	}
	public void setBcLevel(Integer bc_level){
		this.bc_level=bc_level;
	}
	public Integer getBcLevel(){
		return bc_level;
	}
	public void setBcIsleaf(String bc_isleaf){
		this.bc_isleaf=bc_isleaf;
	}
	public String getBcIsleaf(){
		return bc_isleaf;
	}
	public void setBcRemark(String bc_remark){
		this.bc_remark=bc_remark;
	}
	public String getBcRemark(){
		return bc_remark;
	}
	public void setBcOrderno(Integer bc_orderno){
		this.bc_orderno=bc_orderno;
	}
	public Integer getBcOrderno(){
		return bc_orderno;
	}
	public void setBcOrgpath(String bc_orgpath){
		this.bc_orgpath=bc_orgpath;
	}
	public String getBcOrgpath(){
		return bc_orgpath;
	}
	public void setUnderDisasterFlag(String under_disaster_flag){
		this.under_disaster_flag=under_disaster_flag;
	}
	public String getUnderDisasterFlag(){
		return under_disaster_flag;
	}
}


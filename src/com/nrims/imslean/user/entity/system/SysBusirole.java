package com.nrims.imslean.user.entity.system;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class SysBusirole extends ShareField implements Serializable {
 	private String brole_id;
	private String role_id;
	private String bc_id;
	private String brole_name;
	private String brole_code;
	private String brole_starttime;
	private String brole_endtime;
	private Integer brole_exclude;
	private Integer brole_erptype;
	private String brole_moddate;
	private String brole_modtime;
	private String brole_sapid;
	private String brole_orgtype;
	private String brole_state;
	public void setBroleId(String brole_id){
		this.brole_id=brole_id;
	}
	public String getBroleId(){
		return brole_id;
	}
	public void setRoleId(String role_id){
		this.role_id=role_id;
	}
	public String getRoleId(){
		return role_id;
	}
	public void setBcId(String bc_id){
		this.bc_id=bc_id;
	}
	public String getBcId(){
		return bc_id;
	}
	public void setBroleName(String brole_name){
		this.brole_name=brole_name;
	}
	public String getBroleName(){
		return brole_name;
	}
	public void setBroleCode(String brole_code){
		this.brole_code=brole_code;
	}
	public String getBroleCode(){
		return brole_code;
	}
	public void setBroleStarttime(String brole_starttime){
		this.brole_starttime=brole_starttime;
	}
	public String getBroleStarttime(){
		return brole_starttime;
	}
	public void setBroleEndtime(String brole_endtime){
		this.brole_endtime=brole_endtime;
	}
	public String getBroleEndtime(){
		return brole_endtime;
	}
	public void setBroleExclude(Integer brole_exclude){
		this.brole_exclude=brole_exclude;
	}
	public Integer getBroleExclude(){
		return brole_exclude;
	}
	public void setBroleErptype(Integer brole_erptype){
		this.brole_erptype=brole_erptype;
	}
	public Integer getBroleErptype(){
		return brole_erptype;
	}
	public void setBroleModdate(String brole_moddate){
		this.brole_moddate=brole_moddate;
	}
	public String getBroleModdate(){
		return brole_moddate;
	}
	public void setBroleModtime(String brole_modtime){
		this.brole_modtime=brole_modtime;
	}
	public String getBroleModtime(){
		return brole_modtime;
	}
	public void setBroleSapid(String brole_sapid){
		this.brole_sapid=brole_sapid;
	}
	public String getBroleSapid(){
		return brole_sapid;
	}
	public void setBroleOrgtype(String brole_orgtype){
		this.brole_orgtype=brole_orgtype;
	}
	public String getBroleOrgtype(){
		return brole_orgtype;
	}
	public void setBroleState(String brole_state){
		this.brole_state=brole_state;
	}
	public String getBroleState(){
		return brole_state;
	}
}


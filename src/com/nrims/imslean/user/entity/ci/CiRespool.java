package com.nrims.imslean.user.entity.ci;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class CiRespool extends ShareField implements Serializable {
 	private String rp_id;
	private String device_id;
	private String rp_code;
	private String rp_name;
	private String rp_desc;
	private String rp_note;
	private String run_corp;
	private String start_date_active;
	private String end_date_active;
	private String enabled_status;
	private String enabledby_id;
	private String enabledby_name;
	private String enabled_at;
	private String disabledby_id;
	private String disabledby_name;
	private String disabled_at;
	private String createdby_id;
	private String createdby_name;
	private String created_at;
	private String updatedby_id;
	private String updatedby_name;
	private String updated_at;
	private String deleted_flag;
	private String deletedby_id;
	private String deletedby_name;
	private String deleted_at;
	private Integer row_version;
	private String device_datatype;
	private String device_datatype_name;
	private String asset_categories;
	private String asset_categories_name;
	private String cpu_num;
	private String memory_size;
	private String harddisk_volume;
	private String creat_time;
	private String run_take_dept;
	private String run_take_member;
	private String run_tel;
	private String rep_corp_code;
	private String rep_take_dept;
	private String rep_take_member;
	private String rep_tel;
	public void setRpId(String rp_id){
		this.rp_id=rp_id;
	}
	public String getRpId(){
		return rp_id;
	}
	public void setDeviceId(String device_id){
		this.device_id=device_id;
	}
	public String getDeviceId(){
		return device_id;
	}
	public void setRpCode(String rp_code){
		this.rp_code=rp_code;
	}
	public String getRpCode(){
		return rp_code;
	}
	public void setRpName(String rp_name){
		this.rp_name=rp_name;
	}
	public String getRpName(){
		return rp_name;
	}
	public void setRpDesc(String rp_desc){
		this.rp_desc=rp_desc;
	}
	public String getRpDesc(){
		return rp_desc;
	}
	public void setRpNote(String rp_note){
		this.rp_note=rp_note;
	}
	public String getRpNote(){
		return rp_note;
	}
	public void setRunCorp(String run_corp){
		this.run_corp=run_corp;
	}
	public String getRunCorp(){
		return run_corp;
	}
	public void setStartDateActive(String start_date_active){
		this.start_date_active=start_date_active;
	}
	public String getStartDateActive(){
		return start_date_active;
	}
	public void setEndDateActive(String end_date_active){
		this.end_date_active=end_date_active;
	}
	public String getEndDateActive(){
		return end_date_active;
	}
	public void setEnabledStatus(String enabled_status){
		this.enabled_status=enabled_status;
	}
	public String getEnabledStatus(){
		return enabled_status;
	}
	public void setEnabledbyId(String enabledby_id){
		this.enabledby_id=enabledby_id;
	}
	public String getEnabledbyId(){
		return enabledby_id;
	}
	public void setEnabledbyName(String enabledby_name){
		this.enabledby_name=enabledby_name;
	}
	public String getEnabledbyName(){
		return enabledby_name;
	}
	public void setEnabledAt(String enabled_at){
		this.enabled_at=enabled_at;
	}
	public String getEnabledAt(){
		return enabled_at;
	}
	public void setDisabledbyId(String disabledby_id){
		this.disabledby_id=disabledby_id;
	}
	public String getDisabledbyId(){
		return disabledby_id;
	}
	public void setDisabledbyName(String disabledby_name){
		this.disabledby_name=disabledby_name;
	}
	public String getDisabledbyName(){
		return disabledby_name;
	}
	public void setDisabledAt(String disabled_at){
		this.disabled_at=disabled_at;
	}
	public String getDisabledAt(){
		return disabled_at;
	}
	public void setCreatedbyId(String createdby_id){
		this.createdby_id=createdby_id;
	}
	public String getCreatedbyId(){
		return createdby_id;
	}
	public void setCreatedbyName(String createdby_name){
		this.createdby_name=createdby_name;
	}
	public String getCreatedbyName(){
		return createdby_name;
	}
	public void setCreatedAt(String created_at){
		this.created_at=created_at;
	}
	public String getCreatedAt(){
		return created_at;
	}
	public void setUpdatedbyId(String updatedby_id){
		this.updatedby_id=updatedby_id;
	}
	public String getUpdatedbyId(){
		return updatedby_id;
	}
	public void setUpdatedbyName(String updatedby_name){
		this.updatedby_name=updatedby_name;
	}
	public String getUpdatedbyName(){
		return updatedby_name;
	}
	public void setUpdatedAt(String updated_at){
		this.updated_at=updated_at;
	}
	public String getUpdatedAt(){
		return updated_at;
	}
	public void setDeletedFlag(String deleted_flag){
		this.deleted_flag=deleted_flag;
	}
	public String getDeletedFlag(){
		return deleted_flag;
	}
	public void setDeletedbyId(String deletedby_id){
		this.deletedby_id=deletedby_id;
	}
	public String getDeletedbyId(){
		return deletedby_id;
	}
	public void setDeletedbyName(String deletedby_name){
		this.deletedby_name=deletedby_name;
	}
	public String getDeletedbyName(){
		return deletedby_name;
	}
	public void setDeletedAt(String deleted_at){
		this.deleted_at=deleted_at;
	}
	public String getDeletedAt(){
		return deleted_at;
	}
	public void setRowVersion(Integer row_version){
		this.row_version=row_version;
	}
	public Integer getRowVersion(){
		return row_version;
	}
	public void setDeviceDatatype(String device_datatype){
		this.device_datatype=device_datatype;
	}
	public String getDeviceDatatype(){
		return device_datatype;
	}
	public void setDeviceDatatypeName(String device_datatype_name){
		this.device_datatype_name=device_datatype_name;
	}
	public String getDeviceDatatypeName(){
		return device_datatype_name;
	}
	public void setAssetCategories(String asset_categories){
		this.asset_categories=asset_categories;
	}
	public String getAssetCategories(){
		return asset_categories;
	}
	public void setAssetCategoriesName(String asset_categories_name){
		this.asset_categories_name=asset_categories_name;
	}
	public String getAssetCategoriesName(){
		return asset_categories_name;
	}
	public void setCpuNum(String cpu_num){
		this.cpu_num=cpu_num;
	}
	public String getCpuNum(){
		return cpu_num;
	}
	public void setMemorySize(String memory_size){
		this.memory_size=memory_size;
	}
	public String getMemorySize(){
		return memory_size;
	}
	public void setHarddiskVolume(String harddisk_volume){
		this.harddisk_volume=harddisk_volume;
	}
	public String getHarddiskVolume(){
		return harddisk_volume;
	}
	public void setCreatTime(String creat_time){
		this.creat_time=creat_time;
	}
	public String getCreatTime(){
		return creat_time;
	}
	public void setRunTakeDept(String run_take_dept){
		this.run_take_dept=run_take_dept;
	}
	public String getRunTakeDept(){
		return run_take_dept;
	}
	public void setRunTakeMember(String run_take_member){
		this.run_take_member=run_take_member;
	}
	public String getRunTakeMember(){
		return run_take_member;
	}
	public void setRunTel(String run_tel){
		this.run_tel=run_tel;
	}
	public String getRunTel(){
		return run_tel;
	}
	public void setRepCorpCode(String rep_corp_code){
		this.rep_corp_code=rep_corp_code;
	}
	public String getRepCorpCode(){
		return rep_corp_code;
	}
	public void setRepTakeDept(String rep_take_dept){
		this.rep_take_dept=rep_take_dept;
	}
	public String getRepTakeDept(){
		return rep_take_dept;
	}
	public void setRepTakeMember(String rep_take_member){
		this.rep_take_member=rep_take_member;
	}
	public String getRepTakeMember(){
		return rep_take_member;
	}
	public void setRepTel(String rep_tel){
		this.rep_tel=rep_tel;
	}
	public String getRepTel(){
		return rep_tel;
	}
}


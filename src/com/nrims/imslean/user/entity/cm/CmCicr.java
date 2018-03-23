package com.nrims.imslean.user.entity.cm;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class CmCicr extends ShareField implements Serializable {
 	private String ci_cr_id;
	private String ci_id;
	private String ci_pid;
	private String ci_name;
	private String citype_id;
	private String citype_name;
	private Integer ci_version;
	private String ip_addr;
	private String opt_id;
	private String opt_type;
	private String opt_uid;
	private String opt_uname;
	private String opt_bn;
	private String status;
	private String category;
	private String run_corp;
	private String manufacturer_name;
	private String brand_name;
	private String serial_name;
	private String model_name;
	private String network;
	private String device_status;
	private String code;
	private String prop_corp;
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
	private String dep_keep_name;
	private String dep_manage_name;
	private String del_flag;
	public void setCiCrId(String ci_cr_id){
		this.ci_cr_id=ci_cr_id;
	}
	public String getCiCrId(){
		return ci_cr_id;
	}
	public void setCiId(String ci_id){
		this.ci_id=ci_id;
	}
	public String getCiId(){
		return ci_id;
	}
	public void setCiPid(String ci_pid){
		this.ci_pid=ci_pid;
	}
	public String getCiPid(){
		return ci_pid;
	}
	public void setCiName(String ci_name){
		this.ci_name=ci_name;
	}
	public String getCiName(){
		return ci_name;
	}
	public void setCitypeId(String citype_id){
		this.citype_id=citype_id;
	}
	public String getCitypeId(){
		return citype_id;
	}
	public void setCitypeName(String citype_name){
		this.citype_name=citype_name;
	}
	public String getCitypeName(){
		return citype_name;
	}
	public void setCiVersion(Integer ci_version){
		this.ci_version=ci_version;
	}
	public Integer getCiVersion(){
		return ci_version;
	}
	public void setIpAddr(String ip_addr){
		this.ip_addr=ip_addr;
	}
	public String getIpAddr(){
		return ip_addr;
	}
	public void setOptId(String opt_id){
		this.opt_id=opt_id;
	}
	public String getOptId(){
		return opt_id;
	}
	public void setOptType(String opt_type){
		this.opt_type=opt_type;
	}
	public String getOptType(){
		return opt_type;
	}
	public void setOptUid(String opt_uid){
		this.opt_uid=opt_uid;
	}
	public String getOptUid(){
		return opt_uid;
	}
	public void setOptUname(String opt_uname){
		this.opt_uname=opt_uname;
	}
	public String getOptUname(){
		return opt_uname;
	}
	public void setOptBn(String opt_bn){
		this.opt_bn=opt_bn;
	}
	public String getOptBn(){
		return opt_bn;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getCategory(){
		return category;
	}
	public void setRunCorp(String run_corp){
		this.run_corp=run_corp;
	}
	public String getRunCorp(){
		return run_corp;
	}
	public void setManufacturerName(String manufacturer_name){
		this.manufacturer_name=manufacturer_name;
	}
	public String getManufacturerName(){
		return manufacturer_name;
	}
	public void setBrandName(String brand_name){
		this.brand_name=brand_name;
	}
	public String getBrandName(){
		return brand_name;
	}
	public void setSerialName(String serial_name){
		this.serial_name=serial_name;
	}
	public String getSerialName(){
		return serial_name;
	}
	public void setModelName(String model_name){
		this.model_name=model_name;
	}
	public String getModelName(){
		return model_name;
	}
	public void setNetwork(String network){
		this.network=network;
	}
	public String getNetwork(){
		return network;
	}
	public void setDeviceStatus(String device_status){
		this.device_status=device_status;
	}
	public String getDeviceStatus(){
		return device_status;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return code;
	}
	public void setPropCorp(String prop_corp){
		this.prop_corp=prop_corp;
	}
	public String getPropCorp(){
		return prop_corp;
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
	public void setDepKeepName(String dep_keep_name){
		this.dep_keep_name=dep_keep_name;
	}
	public String getDepKeepName(){
		return dep_keep_name;
	}
	public void setDepManageName(String dep_manage_name){
		this.dep_manage_name=dep_manage_name;
	}
	public String getDepManageName(){
		return dep_manage_name;
	}
	public void setDelFlag(String del_flag){
		this.del_flag=del_flag;
	}
	public String getDelFlag(){
		return del_flag;
	}
}


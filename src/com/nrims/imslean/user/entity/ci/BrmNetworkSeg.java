package com.nrims.imslean.user.entity.ci;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class BrmNetworkSeg extends ShareField implements Serializable {
 	private String nseg_id;
	private String start_addr;
	private String end_addr;
	private String netmask;
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
	public void setNsegId(String nseg_id){
		this.nseg_id=nseg_id;
	}
	public String getNsegId(){
		return nseg_id;
	}
	public void setStartAddr(String start_addr){
		this.start_addr=start_addr;
	}
	public String getStartAddr(){
		return start_addr;
	}
	public void setEndAddr(String end_addr){
		this.end_addr=end_addr;
	}
	public String getEndAddr(){
		return end_addr;
	}
	public void setNetmask(String netmask){
		this.netmask=netmask;
	}
	public String getNetmask(){
		return netmask;
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
}


package com.nrims.imslean.user.entity.cm;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class CmLinkCr extends ShareField implements Serializable {
 	private String link_cr_id;
	private String ci_cr_id;
	private String opt_bn;
	private String opt_type;
	private String opt_uid;
	private String opt_uname;
	private String link_id;
	private String asct_id;
	private String src_ci_id;
	private String tgt_ci_id;
	private String status;
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
	public void setLinkCrId(String link_cr_id){
		this.link_cr_id=link_cr_id;
	}
	public String getLinkCrId(){
		return link_cr_id;
	}
	public void setCiCrId(String ci_cr_id){
		this.ci_cr_id=ci_cr_id;
	}
	public String getCiCrId(){
		return ci_cr_id;
	}
	public void setOptBn(String opt_bn){
		this.opt_bn=opt_bn;
	}
	public String getOptBn(){
		return opt_bn;
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
	public void setLinkId(String link_id){
		this.link_id=link_id;
	}
	public String getLinkId(){
		return link_id;
	}
	public void setAsctId(String asct_id){
		this.asct_id=asct_id;
	}
	public String getAsctId(){
		return asct_id;
	}
	public void setSrcCiId(String src_ci_id){
		this.src_ci_id=src_ci_id;
	}
	public String getSrcCiId(){
		return src_ci_id;
	}
	public void setTgtCiId(String tgt_ci_id){
		this.tgt_ci_id=tgt_ci_id;
	}
	public String getTgtCiId(){
		return tgt_ci_id;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
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


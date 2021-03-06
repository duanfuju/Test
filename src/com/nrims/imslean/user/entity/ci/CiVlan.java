package com.nrims.imslean.user.entity.ci;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class CiVlan extends ShareField implements Serializable {
 	private String vlan_id;
	private String vlan_name;
	private String res_category;
	private String res_type;
	private String ci_id;
	private String vlan_type;
	private String vlan_mtu;
	private String vlan_port;
	private String vlan_desc;
	private String vlan_label;
	private String ipaddr;
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
	public void setVlanId(String vlan_id){
		this.vlan_id=vlan_id;
	}
	public String getVlanId(){
		return vlan_id;
	}
	public void setVlanName(String vlan_name){
		this.vlan_name=vlan_name;
	}
	public String getVlanName(){
		return vlan_name;
	}
	public void setResCategory(String res_category){
		this.res_category=res_category;
	}
	public String getResCategory(){
		return res_category;
	}
	public void setResType(String res_type){
		this.res_type=res_type;
	}
	public String getResType(){
		return res_type;
	}
	public void setCiId(String ci_id){
		this.ci_id=ci_id;
	}
	public String getCiId(){
		return ci_id;
	}
	public void setVlanType(String vlan_type){
		this.vlan_type=vlan_type;
	}
	public String getVlanType(){
		return vlan_type;
	}
	public void setVlanMtu(String vlan_mtu){
		this.vlan_mtu=vlan_mtu;
	}
	public String getVlanMtu(){
		return vlan_mtu;
	}
	public void setVlanPort(String vlan_port){
		this.vlan_port=vlan_port;
	}
	public String getVlanPort(){
		return vlan_port;
	}
	public void setVlanDesc(String vlan_desc){
		this.vlan_desc=vlan_desc;
	}
	public String getVlanDesc(){
		return vlan_desc;
	}
	public void setVlanLabel(String vlan_label){
		this.vlan_label=vlan_label;
	}
	public String getVlanLabel(){
		return vlan_label;
	}
	public void setIpaddr(String ipaddr){
		this.ipaddr=ipaddr;
	}
	public String getIpaddr(){
		return ipaddr;
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


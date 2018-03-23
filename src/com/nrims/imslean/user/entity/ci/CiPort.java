package com.nrims.imslean.user.entity.ci;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class CiPort extends ShareField implements Serializable {
 	private String port_id;
	private String ci_id;
	private String res_category;
	private String res_citype;
	private String port_code;
	private String port_name;
	private String port_alias;
	private String port_desc;
	private String port_type;
	private Integer port_idx;
	private String ip_addr;
	private String mac;
	private String subnet_mask;
	private String ipv6_addr;
	private Double port_rate;
	private Integer port_num;
	private String original_id;
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
	public void setPortId(String port_id){
		this.port_id=port_id;
	}
	public String getPortId(){
		return port_id;
	}
	public void setCiId(String ci_id){
		this.ci_id=ci_id;
	}
	public String getCiId(){
		return ci_id;
	}
	public void setResCategory(String res_category){
		this.res_category=res_category;
	}
	public String getResCategory(){
		return res_category;
	}
	public void setResCitype(String res_citype){
		this.res_citype=res_citype;
	}
	public String getResCitype(){
		return res_citype;
	}
	public void setPortCode(String port_code){
		this.port_code=port_code;
	}
	public String getPortCode(){
		return port_code;
	}
	public void setPortName(String port_name){
		this.port_name=port_name;
	}
	public String getPortName(){
		return port_name;
	}
	public void setPortAlias(String port_alias){
		this.port_alias=port_alias;
	}
	public String getPortAlias(){
		return port_alias;
	}
	public void setPortDesc(String port_desc){
		this.port_desc=port_desc;
	}
	public String getPortDesc(){
		return port_desc;
	}
	public void setPortType(String port_type){
		this.port_type=port_type;
	}
	public String getPortType(){
		return port_type;
	}
	public void setPortIdx(Integer port_idx){
		this.port_idx=port_idx;
	}
	public Integer getPortIdx(){
		return port_idx;
	}
	public void setIpAddr(String ip_addr){
		this.ip_addr=ip_addr;
	}
	public String getIpAddr(){
		return ip_addr;
	}
	public void setMac(String mac){
		this.mac=mac;
	}
	public String getMac(){
		return mac;
	}
	public void setSubnetMask(String subnet_mask){
		this.subnet_mask=subnet_mask;
	}
	public String getSubnetMask(){
		return subnet_mask;
	}
	public void setIpv6Addr(String ipv6_addr){
		this.ipv6_addr=ipv6_addr;
	}
	public String getIpv6Addr(){
		return ipv6_addr;
	}
	public void setPortRate(Double port_rate){
		this.port_rate=port_rate;
	}
	public Double getPortRate(){
		return port_rate;
	}
	public void setPortNum(Integer port_num){
		this.port_num=port_num;
	}
	public Integer getPortNum(){
		return port_num;
	}
	public void setOriginalId(String original_id){
		this.original_id=original_id;
	}
	public String getOriginalId(){
		return original_id;
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


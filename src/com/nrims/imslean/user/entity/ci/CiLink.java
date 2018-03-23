package com.nrims.imslean.user.entity.ci;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class CiLink extends ShareField implements Serializable {
 	private String link_id;
	private String link_name;
	private String link_type;
	private String link_layer;
	private String link_level;
	private String port1_id;
	private String port1_desc;
	private String port1_ci_id;
	private String port2_id;
	private String port2_desc;
	private String port2_ci_id;
	private Double link_band;
	private Double link_up_rate;
	private Double link_down_rate;
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
	private String run_corp;
	private String port2_ip;
	private String maintain_type;
	private String link_desc;
	private String network;
	private String port2_run_corp;
	private String port_unit;
	private String res_type;
	private String res_category;
	public void setLinkId(String link_id){
		this.link_id=link_id;
	}
	public String getLinkId(){
		return link_id;
	}
	public void setLinkName(String link_name){
		this.link_name=link_name;
	}
	public String getLinkName(){
		return link_name;
	}
	public void setLinkType(String link_type){
		this.link_type=link_type;
	}
	public String getLinkType(){
		return link_type;
	}
	public void setLinkLayer(String link_layer){
		this.link_layer=link_layer;
	}
	public String getLinkLayer(){
		return link_layer;
	}
	public void setLinkLevel(String link_level){
		this.link_level=link_level;
	}
	public String getLinkLevel(){
		return link_level;
	}
	public void setPort1Id(String port1_id){
		this.port1_id=port1_id;
	}
	public String getPort1Id(){
		return port1_id;
	}
	public void setPort1Desc(String port1_desc){
		this.port1_desc=port1_desc;
	}
	public String getPort1Desc(){
		return port1_desc;
	}
	public void setPort1CiId(String port1_ci_id){
		this.port1_ci_id=port1_ci_id;
	}
	public String getPort1CiId(){
		return port1_ci_id;
	}
	public void setPort2Id(String port2_id){
		this.port2_id=port2_id;
	}
	public String getPort2Id(){
		return port2_id;
	}
	public void setPort2Desc(String port2_desc){
		this.port2_desc=port2_desc;
	}
	public String getPort2Desc(){
		return port2_desc;
	}
	public void setPort2CiId(String port2_ci_id){
		this.port2_ci_id=port2_ci_id;
	}
	public String getPort2CiId(){
		return port2_ci_id;
	}
	public void setLinkBand(Double link_band){
		this.link_band=link_band;
	}
	public Double getLinkBand(){
		return link_band;
	}
	public void setLinkUpRate(Double link_up_rate){
		this.link_up_rate=link_up_rate;
	}
	public Double getLinkUpRate(){
		return link_up_rate;
	}
	public void setLinkDownRate(Double link_down_rate){
		this.link_down_rate=link_down_rate;
	}
	public Double getLinkDownRate(){
		return link_down_rate;
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
	public void setRunCorp(String run_corp){
		this.run_corp=run_corp;
	}
	public String getRunCorp(){
		return run_corp;
	}
	public void setPort2Ip(String port2_ip){
		this.port2_ip=port2_ip;
	}
	public String getPort2Ip(){
		return port2_ip;
	}
	public void setMaintainType(String maintain_type){
		this.maintain_type=maintain_type;
	}
	public String getMaintainType(){
		return maintain_type;
	}
	public void setLinkDesc(String link_desc){
		this.link_desc=link_desc;
	}
	public String getLinkDesc(){
		return link_desc;
	}
	public void setNetwork(String network){
		this.network=network;
	}
	public String getNetwork(){
		return network;
	}
	public void setPort2RunCorp(String port2_run_corp){
		this.port2_run_corp=port2_run_corp;
	}
	public String getPort2RunCorp(){
		return port2_run_corp;
	}
	public void setPortUnit(String port_unit){
		this.port_unit=port_unit;
	}
	public String getPortUnit(){
		return port_unit;
	}
	public void setResType(String res_type){
		this.res_type=res_type;
	}
	public String getResType(){
		return res_type;
	}
	public void setResCategory(String res_category){
		this.res_category=res_category;
	}
	public String getResCategory(){
		return res_category;
	}
}


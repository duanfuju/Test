package com.nrims.imslean.user.entity.ci;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class CiRoutetable extends ShareField implements Serializable {
 	private String rt_id;
	private String rt_name;
	private String ci_id;
	private String ci_category;
	private String citype_id;
	private String rt_protocoltype;
	private String rt_routetype;
	private String rt_targetnet;
	private String rt_mask;
	private String rt_gate;
	private String rt_port;
	private Integer rt_hopcount;
	private String rt_nexthop;
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
	public void setRtId(String rt_id){
		this.rt_id=rt_id;
	}
	public String getRtId(){
		return rt_id;
	}
	public void setRtName(String rt_name){
		this.rt_name=rt_name;
	}
	public String getRtName(){
		return rt_name;
	}
	public void setCiId(String ci_id){
		this.ci_id=ci_id;
	}
	public String getCiId(){
		return ci_id;
	}
	public void setCiCategory(String ci_category){
		this.ci_category=ci_category;
	}
	public String getCiCategory(){
		return ci_category;
	}
	public void setCitypeId(String citype_id){
		this.citype_id=citype_id;
	}
	public String getCitypeId(){
		return citype_id;
	}
	public void setRtProtocoltype(String rt_protocoltype){
		this.rt_protocoltype=rt_protocoltype;
	}
	public String getRtProtocoltype(){
		return rt_protocoltype;
	}
	public void setRtRoutetype(String rt_routetype){
		this.rt_routetype=rt_routetype;
	}
	public String getRtRoutetype(){
		return rt_routetype;
	}
	public void setRtTargetnet(String rt_targetnet){
		this.rt_targetnet=rt_targetnet;
	}
	public String getRtTargetnet(){
		return rt_targetnet;
	}
	public void setRtMask(String rt_mask){
		this.rt_mask=rt_mask;
	}
	public String getRtMask(){
		return rt_mask;
	}
	public void setRtGate(String rt_gate){
		this.rt_gate=rt_gate;
	}
	public String getRtGate(){
		return rt_gate;
	}
	public void setRtPort(String rt_port){
		this.rt_port=rt_port;
	}
	public String getRtPort(){
		return rt_port;
	}
	public void setRtHopcount(Integer rt_hopcount){
		this.rt_hopcount=rt_hopcount;
	}
	public Integer getRtHopcount(){
		return rt_hopcount;
	}
	public void setRtNexthop(String rt_nexthop){
		this.rt_nexthop=rt_nexthop;
	}
	public String getRtNexthop(){
		return rt_nexthop;
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


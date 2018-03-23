package com.dfj.entity;
import com.tiansu.eam.common.persistence.DataEntity;
import java.util.Date;
import java.sql.*;

   /**
    * ts_patrol_standard 实体类
    * Mon Jul 24 19:49:55 CST 2017 dfj
    */ 


public class TsPatrolStandard extends  DataEntity<TsPatrolStandard> {
 	private Integer id;
	private String patrol_standard_code;
	private Integer library_id;
	private String patrol_standard_description;
	private String patrol_standard_explain;
	private String patrol_standard_remark;
	private Integer patrol_standard_status;
	private Date create_time;
	private Date modify_time;
	private Integer oldid;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setPatrolStandardCode(String patrol_standard_code){
		this.patrol_standard_code=patrol_standard_code;
	}
	public String getPatrolStandardCode(){
		return patrol_standard_code;
	}
	public void setLibraryId(Integer library_id){
		this.library_id=library_id;
	}
	public Integer getLibraryId(){
		return library_id;
	}
	public void setPatrolStandardDescription(String patrol_standard_description){
		this.patrol_standard_description=patrol_standard_description;
	}
	public String getPatrolStandardDescription(){
		return patrol_standard_description;
	}
	public void setPatrolStandardExplain(String patrol_standard_explain){
		this.patrol_standard_explain=patrol_standard_explain;
	}
	public String getPatrolStandardExplain(){
		return patrol_standard_explain;
	}
	public void setPatrolStandardRemark(String patrol_standard_remark){
		this.patrol_standard_remark=patrol_standard_remark;
	}
	public String getPatrolStandardRemark(){
		return patrol_standard_remark;
	}
	public void setPatrolStandardStatus(Integer patrol_standard_status){
		this.patrol_standard_status=patrol_standard_status;
	}
	public Integer getPatrolStandardStatus(){
		return patrol_standard_status;
	}
	public void setCreateTime(Date create_time){
		this.create_time=create_time;
	}
	public Date getCreateTime(){
		return create_time;
	}
	public void setModifyTime(Date modify_time){
		this.modify_time=modify_time;
	}
	public Date getModifyTime(){
		return modify_time;
	}
	public void setOldid(Integer oldid){
		this.oldid=oldid;
	}
	public Integer getOldid(){
		return oldid;
	}
}


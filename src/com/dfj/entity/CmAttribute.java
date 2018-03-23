package com.dfj.entity;
import com.tiansu.eam.common.persistence.DataEntity;

   /**
    * cm_attribute 实体类
    * Thu Jan 18 11:30:44 CST 2018 dfj
    */ 


public class CmAttribute extends  DataEntity<CmAttribute> {
 	private String ATTR_ID;
	private String ATTR_CODE;
	private String ATTR_NAME;
	private String ATTR_DESC;
	private String ATTR_NOTE;
	private String ATTR_DATA_TYPE;
	private Integer ATTR_DATA_LEN;
	private Integer ATTR_DATA_PRECISION;
	private String ATTR_UNIT;
	private String ATTR_CNT;
	private String ATTR_CND;
	private String ENUM_ID;
	private String START_DATE_ACTIVE;
	private String END_DATE_ACTIVE;
	private String ENABLED_STATUS;
	private String ENABLEDBY_ID;
	private String ENABLEDBY_NAME;
	private String ENABLED_AT;
	private String DISABLEDBY_ID;
	private String DISABLEDBY_NAME;
	private String DISABLED_AT;
	private String CREATEDBY_ID;
	private String CREATEDBY_NAME;
	private String CREATED_AT;
	private String UPDATEDBY_ID;
	private String UPDATEDBY_NAME;
	private String UPDATED_AT;
	private String DELETED_FLAG;
	private String DELETEDBY_ID;
	private String DELETEDBY_NAME;
	private String DELETED_AT;
	private Integer ROW_VERSION;
	public void setATTRID(String ATTR_ID){
		this.ATTR_ID=ATTR_ID;
	}
	public String getATTRID(){
		return ATTR_ID;
	}
	public void setATTRCODE(String ATTR_CODE){
		this.ATTR_CODE=ATTR_CODE;
	}
	public String getATTRCODE(){
		return ATTR_CODE;
	}
	public void setATTRNAME(String ATTR_NAME){
		this.ATTR_NAME=ATTR_NAME;
	}
	public String getATTRNAME(){
		return ATTR_NAME;
	}
	public void setATTRDESC(String ATTR_DESC){
		this.ATTR_DESC=ATTR_DESC;
	}
	public String getATTRDESC(){
		return ATTR_DESC;
	}
	public void setATTRNOTE(String ATTR_NOTE){
		this.ATTR_NOTE=ATTR_NOTE;
	}
	public String getATTRNOTE(){
		return ATTR_NOTE;
	}
	public void setATTRDATATYPE(String ATTR_DATA_TYPE){
		this.ATTR_DATA_TYPE=ATTR_DATA_TYPE;
	}
	public String getATTRDATATYPE(){
		return ATTR_DATA_TYPE;
	}
	public void setATTRDATALEN(Integer ATTR_DATA_LEN){
		this.ATTR_DATA_LEN=ATTR_DATA_LEN;
	}
	public Integer getATTRDATALEN(){
		return ATTR_DATA_LEN;
	}
	public void setATTRDATAPRECISION(Integer ATTR_DATA_PRECISION){
		this.ATTR_DATA_PRECISION=ATTR_DATA_PRECISION;
	}
	public Integer getATTRDATAPRECISION(){
		return ATTR_DATA_PRECISION;
	}
	public void setATTRUNIT(String ATTR_UNIT){
		this.ATTR_UNIT=ATTR_UNIT;
	}
	public String getATTRUNIT(){
		return ATTR_UNIT;
	}
	public void setATTRCNT(String ATTR_CNT){
		this.ATTR_CNT=ATTR_CNT;
	}
	public String getATTRCNT(){
		return ATTR_CNT;
	}
	public void setATTRCND(String ATTR_CND){
		this.ATTR_CND=ATTR_CND;
	}
	public String getATTRCND(){
		return ATTR_CND;
	}
	public void setENUMID(String ENUM_ID){
		this.ENUM_ID=ENUM_ID;
	}
	public String getENUMID(){
		return ENUM_ID;
	}
	public void setSTARTDATEACTIVE(String START_DATE_ACTIVE){
		this.START_DATE_ACTIVE=START_DATE_ACTIVE;
	}
	public String getSTARTDATEACTIVE(){
		return START_DATE_ACTIVE;
	}
	public void setENDDATEACTIVE(String END_DATE_ACTIVE){
		this.END_DATE_ACTIVE=END_DATE_ACTIVE;
	}
	public String getENDDATEACTIVE(){
		return END_DATE_ACTIVE;
	}
	public void setENABLEDSTATUS(String ENABLED_STATUS){
		this.ENABLED_STATUS=ENABLED_STATUS;
	}
	public String getENABLEDSTATUS(){
		return ENABLED_STATUS;
	}
	public void setENABLEDBYID(String ENABLEDBY_ID){
		this.ENABLEDBY_ID=ENABLEDBY_ID;
	}
	public String getENABLEDBYID(){
		return ENABLEDBY_ID;
	}
	public void setENABLEDBYNAME(String ENABLEDBY_NAME){
		this.ENABLEDBY_NAME=ENABLEDBY_NAME;
	}
	public String getENABLEDBYNAME(){
		return ENABLEDBY_NAME;
	}
	public void setENABLEDAT(String ENABLED_AT){
		this.ENABLED_AT=ENABLED_AT;
	}
	public String getENABLEDAT(){
		return ENABLED_AT;
	}
	public void setDISABLEDBYID(String DISABLEDBY_ID){
		this.DISABLEDBY_ID=DISABLEDBY_ID;
	}
	public String getDISABLEDBYID(){
		return DISABLEDBY_ID;
	}
	public void setDISABLEDBYNAME(String DISABLEDBY_NAME){
		this.DISABLEDBY_NAME=DISABLEDBY_NAME;
	}
	public String getDISABLEDBYNAME(){
		return DISABLEDBY_NAME;
	}
	public void setDISABLEDAT(String DISABLED_AT){
		this.DISABLED_AT=DISABLED_AT;
	}
	public String getDISABLEDAT(){
		return DISABLED_AT;
	}
	public void setCREATEDBYID(String CREATEDBY_ID){
		this.CREATEDBY_ID=CREATEDBY_ID;
	}
	public String getCREATEDBYID(){
		return CREATEDBY_ID;
	}
	public void setCREATEDBYNAME(String CREATEDBY_NAME){
		this.CREATEDBY_NAME=CREATEDBY_NAME;
	}
	public String getCREATEDBYNAME(){
		return CREATEDBY_NAME;
	}
	public void setCREATEDAT(String CREATED_AT){
		this.CREATED_AT=CREATED_AT;
	}
	public String getCREATEDAT(){
		return CREATED_AT;
	}
	public void setUPDATEDBYID(String UPDATEDBY_ID){
		this.UPDATEDBY_ID=UPDATEDBY_ID;
	}
	public String getUPDATEDBYID(){
		return UPDATEDBY_ID;
	}
	public void setUPDATEDBYNAME(String UPDATEDBY_NAME){
		this.UPDATEDBY_NAME=UPDATEDBY_NAME;
	}
	public String getUPDATEDBYNAME(){
		return UPDATEDBY_NAME;
	}
	public void setUPDATEDAT(String UPDATED_AT){
		this.UPDATED_AT=UPDATED_AT;
	}
	public String getUPDATEDAT(){
		return UPDATED_AT;
	}
	public void setDELETEDFLAG(String DELETED_FLAG){
		this.DELETED_FLAG=DELETED_FLAG;
	}
	public String getDELETEDFLAG(){
		return DELETED_FLAG;
	}
	public void setDELETEDBYID(String DELETEDBY_ID){
		this.DELETEDBY_ID=DELETEDBY_ID;
	}
	public String getDELETEDBYID(){
		return DELETEDBY_ID;
	}
	public void setDELETEDBYNAME(String DELETEDBY_NAME){
		this.DELETEDBY_NAME=DELETEDBY_NAME;
	}
	public String getDELETEDBYNAME(){
		return DELETEDBY_NAME;
	}
	public void setDELETEDAT(String DELETED_AT){
		this.DELETED_AT=DELETED_AT;
	}
	public String getDELETEDAT(){
		return DELETED_AT;
	}
	public void setROWVERSION(Integer ROW_VERSION){
		this.ROW_VERSION=ROW_VERSION;
	}
	public Integer getROWVERSION(){
		return ROW_VERSION;
	}
}


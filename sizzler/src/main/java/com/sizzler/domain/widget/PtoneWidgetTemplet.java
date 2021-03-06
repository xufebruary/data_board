package com.sizzler.domain.widget;

import java.io.Serializable;

import com.sizzler.dexcoder.annotation.PK;

public class PtoneWidgetTemplet implements Serializable {

  private static final long serialVersionUID = 2575151230061637570L;

  @PK
  private String widgetId;
  private String panelId;
  private String widgetTitle;
  private String widgetType; // chart or tool
  private String isTitleUpdate;
  private Long ptoneGraphInfoId;
  private String graphName;
  private String mapCode; // 地图code，国家地图为国家名，世界地图为空
  private String dateKey;
  private String datePeriod;
  private String creatorId;
  private String modifierId;
  private String status; // 0:无效，1：有效
  private Long createTime;
  private Long modifyTime;
  private Integer refreshInterval;
  private String targetValue;
  private String description;
  private String metricsJson;
  private String dimensionsJson;
  private String segmentsJson;
  private String filtersJson;
  private String templetId; // 模板id用于获取demo数据，值同模板的widgetId
  private String isTemplate; // 是否为模板，0：不是模板，1：是模板
  private Integer isExample; // 是否使用模板数据，用户修改后或授权后修改为0, 0:展示GA数据，1：展示demo数据，默认展示demo数据
  private Integer isDemo;
  private Integer sizeX;
  private Integer sizeY;
  private String showTimePeriod;// widget图表上是否显示时间范围，默认不显示
  private String showMetricAmount; // 是否显示指标总量
  private String spaceId;
  private String parentId;
  private String isPublish;// 是否发布
  private String publishArea;// 发布区域
  private String dsCode;
  private Integer orderNumber;
  private String templetGraphName; // widget模板名称
  private String isPreview;//是否预览widget 0：不是，1：是

  public String getIsPreview() {
    return isPreview;
  }

  public void setIsPreview(String isPreview) {
    this.isPreview = isPreview;
  }

  public String getIsTitleUpdate() {
    return isTitleUpdate;
  }

  public void setIsTitleUpdate(String isTitleUpdate) {
    this.isTitleUpdate = isTitleUpdate;
  }

  public String getTempletGraphName() {
    return templetGraphName;
  }

  public void setTempletGraphName(String templetGraphName) {
    this.templetGraphName = templetGraphName;
  }

  public Integer getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getDsCode() {
    return dsCode;
  }

  public void setDsCode(String dsCode) {
    this.dsCode = dsCode;
  }

  public String getIsPublish() {
    return isPublish;
  }

  public void setIsPublish(String isPublish) {
    this.isPublish = isPublish;
  }

  public String getPublishArea() {
    return publishArea;
  }

  public void setPublishArea(String publishArea) {
    this.publishArea = publishArea;
  }

  public String getPanelId() {
    return panelId;
  }

  public void setPanelId(String panelId) {
    this.panelId = panelId;
  }

  public Integer getIsDemo() {
    return isDemo;
  }

  public void setIsDemo(Integer isDemo) {
    this.isDemo = isDemo;
  }

  public String getShowTimePeriod() {
    return showTimePeriod;
  }

  public void setShowTimePeriod(String showTimePeriod) {
    this.showTimePeriod = showTimePeriod;
  }

  public String getShowMetricAmount() {
    return showMetricAmount;
  }

  public void setShowMetricAmount(String showMetricAmount) {
    this.showMetricAmount = showMetricAmount;
  }

  public Integer getSizeX() {
    return sizeX;
  }

  public void setSizeX(Integer sizeX) {
    this.sizeX = sizeX;
  }

  public Integer getSizeY() {
    return sizeY;
  }

  public void setSizeY(Integer sizeY) {
    this.sizeY = sizeY;
  }

  public String getWidgetType() {
    return widgetType;
  }

  public void setWidgetType(String widgetType) {
    this.widgetType = widgetType;
  }

  public Long getPtoneGraphInfoId() {
    return ptoneGraphInfoId;
  }

  public void setPtoneGraphInfoId(Long ptoneGraphInfoId) {
    this.ptoneGraphInfoId = ptoneGraphInfoId;
  }

  public String getGraphName() {
    return graphName;
  }

  public void setGraphName(String graphName) {
    this.graphName = graphName;
  }

  public String getMapCode() {
    return mapCode;
  }

  public void setMapCode(String mapCode) {
    this.mapCode = mapCode;
  }

  public String getWidgetId() {
    return widgetId;
  }

  public void setWidgetId(String widgetId) {
    this.widgetId = widgetId;
  }

  public String getWidgetTitle() {
    return widgetTitle;
  }

  public void setWidgetTitle(String widgetTitle) {
    this.widgetTitle = widgetTitle;
  }

  public String getDateKey() {
    return dateKey;
  }

  public void setDateKey(String dateKey) {
    this.dateKey = dateKey;
  }

  public String getDatePeriod() {
    return datePeriod;
  }

  public void setDatePeriod(String datePeriod) {
    this.datePeriod = datePeriod;
  }

  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public String getModifierId() {
    return modifierId;
  }

  public void setModifierId(String modifierId) {
    this.modifierId = modifierId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public Long getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(Long modifyTime) {
    this.modifyTime = modifyTime;
  }

  public Integer getRefreshInterval() {
    return refreshInterval;
  }

  public void setRefreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
  }

  public String getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(String targetValue) {
    this.targetValue = targetValue;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getMetricsJson() {
    return metricsJson;
  }

  public void setMetricsJson(String metricsJson) {
    this.metricsJson = metricsJson;
  }

  public String getDimensionsJson() {
    return dimensionsJson;
  }

  public void setDimensionsJson(String dimensionsJson) {
    this.dimensionsJson = dimensionsJson;
  }

  public String getTempletId() {
    return templetId;
  }

  public void setTempletId(String templetId) {
    this.templetId = templetId;
  }

  public String getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(String isTemplate) {
    this.isTemplate = isTemplate;
  }

  public Integer getIsExample() {
    return isExample;
  }

  public void setIsExample(Integer isExample) {
    this.isExample = isExample;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public String getSegmentsJson() {
    return segmentsJson;
  }

  public void setSegmentsJson(String segmentsJson) {
    this.segmentsJson = segmentsJson;
  }

  public String getFiltersJson() {
    return filtersJson;
  }

  public void setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
  }

}

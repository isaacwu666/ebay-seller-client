/*
 * ebay官方api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.nextop.ebay.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The type that defines the fields for the &lt;strong&gt;createSchedule&lt;/strong&gt; method.
 */
@ApiModel(description = "The type that defines the fields for the <strong>createSchedule</strong> method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class CreateUserScheduleRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FEED_TYPE = "feedType";
  @SerializedName(SERIALIZED_NAME_FEED_TYPE)
  private String feedType;

  public static final String SERIALIZED_NAME_PREFERRED_TRIGGER_DAY_OF_MONTH = "preferredTriggerDayOfMonth";
  @SerializedName(SERIALIZED_NAME_PREFERRED_TRIGGER_DAY_OF_MONTH)
  private Integer preferredTriggerDayOfMonth;

  public static final String SERIALIZED_NAME_PREFERRED_TRIGGER_DAY_OF_WEEK = "preferredTriggerDayOfWeek";
  @SerializedName(SERIALIZED_NAME_PREFERRED_TRIGGER_DAY_OF_WEEK)
  private String preferredTriggerDayOfWeek;

  public static final String SERIALIZED_NAME_PREFERRED_TRIGGER_HOUR = "preferredTriggerHour";
  @SerializedName(SERIALIZED_NAME_PREFERRED_TRIGGER_HOUR)
  private String preferredTriggerHour;

  public static final String SERIALIZED_NAME_SCHEDULE_END_DATE = "scheduleEndDate";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_END_DATE)
  private String scheduleEndDate;

  public static final String SERIALIZED_NAME_SCHEDULE_NAME = "scheduleName";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_NAME)
  private String scheduleName;

  public static final String SERIALIZED_NAME_SCHEDULE_START_DATE = "scheduleStartDate";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_START_DATE)
  private String scheduleStartDate;

  public static final String SERIALIZED_NAME_SCHEDULE_TEMPLATE_ID = "scheduleTemplateId";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TEMPLATE_ID)
  private String scheduleTemplateId;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schemaVersion";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private String schemaVersion;


  public CreateUserScheduleRequest feedType(String feedType) {
    
    this.feedType = feedType;
    return this;
  }

   /**
   * The name of the feed type for the created schedule. Match the &lt;strong&gt;feed_type&lt;/strong&gt; from the schedule template associated with this schedule.
   * @return feedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the feed type for the created schedule. Match the <strong>feed_type</strong> from the schedule template associated with this schedule.")

  public String getFeedType() {
    return feedType;
  }


  public void setFeedType(String feedType) {
    this.feedType = feedType;
  }


  public CreateUserScheduleRequest preferredTriggerDayOfMonth(Integer preferredTriggerDayOfMonth) {
    
    this.preferredTriggerDayOfMonth = preferredTriggerDayOfMonth;
    return this;
  }

   /**
   * The preferred day of the month to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for monthly schedules. The last day of the month is used for numbers larger than the actual number of days in the month. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Minimum: &lt;/b&gt;1&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum: &lt;/b&gt;31
   * @return preferredTriggerDayOfMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The preferred day of the month to trigger the schedule. This field can be used with <strong>preferredTriggerHour</strong> for monthly schedules. The last day of the month is used for numbers larger than the actual number of days in the month. <br /><br />This field is available as specified by the template (<strong>scheduleTemplateId</strong>). The template can specify this field as optional or required, and optionally provides a default value.<br /><br /><b>Minimum: </b>1<br /><br /><b>Maximum: </b>31")

  public Integer getPreferredTriggerDayOfMonth() {
    return preferredTriggerDayOfMonth;
  }


  public void setPreferredTriggerDayOfMonth(Integer preferredTriggerDayOfMonth) {
    this.preferredTriggerDayOfMonth = preferredTriggerDayOfMonth;
  }


  public CreateUserScheduleRequest preferredTriggerDayOfWeek(String preferredTriggerDayOfWeek) {
    
    this.preferredTriggerDayOfWeek = preferredTriggerDayOfWeek;
    return this;
  }

   /**
   * The preferred day of the week to trigger the schedule. This field can be used with &lt;strong&gt;preferredTriggerHour&lt;/strong&gt; for weekly schedules. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return preferredTriggerDayOfWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The preferred day of the week to trigger the schedule. This field can be used with <strong>preferredTriggerHour</strong> for weekly schedules. <br /><br />This field is available as specified by the template (<strong>scheduleTemplateId</strong>). The template can specify this field as optional or required, and optionally provides a default value. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/feed/types/api:DayOfWeekEnum'>eBay API documentation</a>")

  public String getPreferredTriggerDayOfWeek() {
    return preferredTriggerDayOfWeek;
  }


  public void setPreferredTriggerDayOfWeek(String preferredTriggerDayOfWeek) {
    this.preferredTriggerDayOfWeek = preferredTriggerDayOfWeek;
  }


  public CreateUserScheduleRequest preferredTriggerHour(String preferredTriggerHour) {
    
    this.preferredTriggerHour = preferredTriggerHour;
    return this;
  }

   /**
   * The preferred two-digit hour of the day to trigger the schedule. &lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;hhZ&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents 11:00 am UTC:&lt;code&gt; 11Z&lt;/code&gt;
   * @return preferredTriggerHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The preferred two-digit hour of the day to trigger the schedule. <br /><br />This field is available as specified by the template (<strong>scheduleTemplateId</strong>). The template can specify this field as optional or required, and optionally provides a default value.<br /><br /><b>Format:</b> UTC <code>hhZ</code><br /><br />For example, the following represents 11:00 am UTC:<code> 11Z</code>")

  public String getPreferredTriggerHour() {
    return preferredTriggerHour;
  }


  public void setPreferredTriggerHour(String preferredTriggerHour) {
    this.preferredTriggerHour = preferredTriggerHour;
  }


  public CreateUserScheduleRequest scheduleEndDate(String scheduleEndDate) {
    
    this.scheduleEndDate = scheduleEndDate;
    return this;
  }

   /**
   * The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes &lt;code&gt;INACTIVE&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt;Use this field, if available, to end the schedule in the future. This value must be later than &lt;strong&gt;scheduleStartDate&lt;/strong&gt; (if supplied). This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents UTC October 10, 2021 at 10:00 AM:&lt;br /&gt;&lt;code&gt;2021-10-10T10Z&lt;/code&gt;
   * @return scheduleEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp on which the report generation (subscription) ends. After this date, the schedule status becomes <code>INACTIVE</code>. <br /><br />Use this field, if available, to end the schedule in the future. This value must be later than <strong>scheduleStartDate</strong> (if supplied). This field is available as specified by the template (<strong>scheduleTemplateId</strong>). The template can specify this field as optional or required, and optionally provides a default value.<br /><br /><b>Format:</b> UTC <code>yyyy-MM-dd<strong>T</strong>HH<strong>Z</strong></code><br /><br />For example, the following represents UTC October 10, 2021 at 10:00 AM:<br /><code>2021-10-10T10Z</code>")

  public String getScheduleEndDate() {
    return scheduleEndDate;
  }


  public void setScheduleEndDate(String scheduleEndDate) {
    this.scheduleEndDate = scheduleEndDate;
  }


  public CreateUserScheduleRequest scheduleName(String scheduleName) {
    
    this.scheduleName = scheduleName;
    return this;
  }

   /**
   * The schedule name assigned by the user for the created schedule.
   * @return scheduleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The schedule name assigned by the user for the created schedule.")

  public String getScheduleName() {
    return scheduleName;
  }


  public void setScheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
  }


  public CreateUserScheduleRequest scheduleStartDate(String scheduleStartDate) {
    
    this.scheduleStartDate = scheduleStartDate;
    return this;
  }

   /**
   * The timestamp to start generating the report. After this timestamp, the schedule status becomes active until either the &lt;strong&gt;scheduleEndDate&lt;/strong&gt; occurs or the &lt;strong&gt;scheduleTemplateId&lt;/strong&gt; becomes inactive. &lt;br /&gt;&lt;br /&gt;Use this field, if available, to start the schedule in the future but before the &lt;strong&gt;scheduleEndDate&lt;/strong&gt; (if supplied). This field is available as specified by the template &lt;strong&gt;(scheduleTemplateId)&lt;/strong&gt;.  The template can specify this field as optional or required, and optionally provides a default value.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Format:&lt;/b&gt; UTC &lt;code&gt;yyyy-MM-dd&lt;strong&gt;T&lt;/strong&gt;HH&lt;strong&gt;Z&lt;/strong&gt;&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;For example, the following represents a schedule start date of UTC October 01, 2020 at 12:00 PM:&lt;br /&gt;&lt;code&gt; 2020-01-01T12Z&lt;/code&gt;
   * @return scheduleStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp to start generating the report. After this timestamp, the schedule status becomes active until either the <strong>scheduleEndDate</strong> occurs or the <strong>scheduleTemplateId</strong> becomes inactive. <br /><br />Use this field, if available, to start the schedule in the future but before the <strong>scheduleEndDate</strong> (if supplied). This field is available as specified by the template <strong>(scheduleTemplateId)</strong>.  The template can specify this field as optional or required, and optionally provides a default value.<br /><br /><b>Format:</b> UTC <code>yyyy-MM-dd<strong>T</strong>HH<strong>Z</strong></code><br /><br />For example, the following represents a schedule start date of UTC October 01, 2020 at 12:00 PM:<br /><code> 2020-01-01T12Z</code>")

  public String getScheduleStartDate() {
    return scheduleStartDate;
  }


  public void setScheduleStartDate(String scheduleStartDate) {
    this.scheduleStartDate = scheduleStartDate;
  }


  public CreateUserScheduleRequest scheduleTemplateId(String scheduleTemplateId) {
    
    this.scheduleTemplateId = scheduleTemplateId;
    return this;
  }

   /**
   * The ID of the template associated with the schedule ID. You can get this ID from the documentation or by calling the &lt;strong&gt;getScheduleTemplates&lt;/strong&gt; method. This method requires a schedule template ID that is &lt;code&gt;ACTIVE&lt;/code&gt;.
   * @return scheduleTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the template associated with the schedule ID. You can get this ID from the documentation or by calling the <strong>getScheduleTemplates</strong> method. This method requires a schedule template ID that is <code>ACTIVE</code>.")

  public String getScheduleTemplateId() {
    return scheduleTemplateId;
  }


  public void setScheduleTemplateId(String scheduleTemplateId) {
    this.scheduleTemplateId = scheduleTemplateId;
  }


  public CreateUserScheduleRequest schemaVersion(String schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * The schema version of the schedule feedType. This field is required if the &lt;strong&gt;feedType&lt;/strong&gt; has a schema version.&lt;br /&gt;&lt;br /&gt;This field is available as specified by the template (&lt;strong&gt;scheduleTemplateId&lt;/strong&gt;). The template can specify this field as optional or required, and optionally provides a default value.
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The schema version of the schedule feedType. This field is required if the <strong>feedType</strong> has a schema version.<br /><br />This field is available as specified by the template (<strong>scheduleTemplateId</strong>). The template can specify this field as optional or required, and optionally provides a default value.")

  public String getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserScheduleRequest createUserScheduleRequest = (CreateUserScheduleRequest) o;
    return Objects.equals(this.feedType, createUserScheduleRequest.feedType) &&
        Objects.equals(this.preferredTriggerDayOfMonth, createUserScheduleRequest.preferredTriggerDayOfMonth) &&
        Objects.equals(this.preferredTriggerDayOfWeek, createUserScheduleRequest.preferredTriggerDayOfWeek) &&
        Objects.equals(this.preferredTriggerHour, createUserScheduleRequest.preferredTriggerHour) &&
        Objects.equals(this.scheduleEndDate, createUserScheduleRequest.scheduleEndDate) &&
        Objects.equals(this.scheduleName, createUserScheduleRequest.scheduleName) &&
        Objects.equals(this.scheduleStartDate, createUserScheduleRequest.scheduleStartDate) &&
        Objects.equals(this.scheduleTemplateId, createUserScheduleRequest.scheduleTemplateId) &&
        Objects.equals(this.schemaVersion, createUserScheduleRequest.schemaVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedType, preferredTriggerDayOfMonth, preferredTriggerDayOfWeek, preferredTriggerHour, scheduleEndDate, scheduleName, scheduleStartDate, scheduleTemplateId, schemaVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserScheduleRequest {\n");
    sb.append("    feedType: ").append(toIndentedString(feedType)).append("\n");
    sb.append("    preferredTriggerDayOfMonth: ").append(toIndentedString(preferredTriggerDayOfMonth)).append("\n");
    sb.append("    preferredTriggerDayOfWeek: ").append(toIndentedString(preferredTriggerDayOfWeek)).append("\n");
    sb.append("    preferredTriggerHour: ").append(toIndentedString(preferredTriggerHour)).append("\n");
    sb.append("    scheduleEndDate: ").append(toIndentedString(scheduleEndDate)).append("\n");
    sb.append("    scheduleName: ").append(toIndentedString(scheduleName)).append("\n");
    sb.append("    scheduleStartDate: ").append(toIndentedString(scheduleStartDate)).append("\n");
    sb.append("    scheduleTemplateId: ").append(toIndentedString(scheduleTemplateId)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


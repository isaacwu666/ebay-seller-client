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
import com.nextop.ebay.client.model.Error;
import com.nextop.ebay.client.model.Header;
import com.nextop.ebay.client.model.Metadata;
import com.nextop.ebay.client.model.Record;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The complex type that defines that defines the report.
 */
@ApiModel(description = "The complex type that defines that defines the report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class Report implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DIMENSION_METADATA = "dimensionMetadata";
  @SerializedName(SERIALIZED_NAME_DIMENSION_METADATA)
  private List<Metadata> dimensionMetadata = null;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private Header header;

  public static final String SERIALIZED_NAME_LAST_UPDATED_DATE = "lastUpdatedDate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_DATE)
  private String lastUpdatedDate;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<Record> records = null;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<Error> warnings = null;


  public Report dimensionMetadata(List<Metadata> dimensionMetadata) {
    
    this.dimensionMetadata = dimensionMetadata;
    return this;
  }

  public Report addDimensionMetadataItem(Metadata dimensionMetadataItem) {
    if (this.dimensionMetadata == null) {
      this.dimensionMetadata = new ArrayList<Metadata>();
    }
    this.dimensionMetadata.add(dimensionMetadataItem);
    return this;
  }

   /**
   * A complex type containing the header of the report and the type of data containted in the rows of the report.
   * @return dimensionMetadata
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "A complex type containing the header of the report and the type of data containted in the rows of the report.")

  public List<Metadata> getDimensionMetadata() {
    return dimensionMetadata;
  }


  public void setDimensionMetadata(List<Metadata> dimensionMetadata) {
    this.dimensionMetadata = dimensionMetadata;
  }


  public Report endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The time stamp is formatted as an ISO 8601 string, which is based on the 24-hour Universal Coordinated Time (UTC) clock. If you specify an end date that is beyond the lastUpdatedDate value, eBay returns a report that contains data only up to the lastUpdateDate date. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2018-08-20T07:09:00.000Z
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time stamp is formatted as an ISO 8601 string, which is based on the 24-hour Universal Coordinated Time (UTC) clock. If you specify an end date that is beyond the lastUpdatedDate value, eBay returns a report that contains data only up to the lastUpdateDate date. Format: [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z Example: 2018-08-20T07:09:00.000Z")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public Report header(Header header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")

  public Header getHeader() {
    return header;
  }


  public void setHeader(Header header) {
    this.header = header;
  }


  public Report lastUpdatedDate(String lastUpdatedDate) {
    
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * The date and time, in ISO 8601 format, that indicates the last time the data returned in the report was updated.
   * @return lastUpdatedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time, in ISO 8601 format, that indicates the last time the data returned in the report was updated.")

  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }


  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  public Report records(List<Record> records) {
    
    this.records = records;
    return this;
  }

  public Report addRecordsItem(Record recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Record>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * A complex type containing the individual data records for the traffic report.
   * @return records
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "A complex type containing the individual data records for the traffic report.")

  public List<Record> getRecords() {
    return records;
  }


  public void setRecords(List<Record> records) {
    this.records = records;
  }


  public Report startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the date range used to calculate the report, in ISO 8601 format.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of the date range used to calculate the report, in ISO 8601 format.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public Report warnings(List<Error> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public Report addWarningsItem(Error warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<Error>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * An array of any process errors or warnings that were generated during the processing of the call processing.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "An array of any process errors or warnings that were generated during the processing of the call processing.")

  public List<Error> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<Error> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.dimensionMetadata, report.dimensionMetadata) &&
        Objects.equals(this.endDate, report.endDate) &&
        Objects.equals(this.header, report.header) &&
        Objects.equals(this.lastUpdatedDate, report.lastUpdatedDate) &&
        Objects.equals(this.records, report.records) &&
        Objects.equals(this.startDate, report.startDate) &&
        Objects.equals(this.warnings, report.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionMetadata, endDate, header, lastUpdatedDate, records, startDate, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    sb.append("    dimensionMetadata: ").append(toIndentedString(dimensionMetadata)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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


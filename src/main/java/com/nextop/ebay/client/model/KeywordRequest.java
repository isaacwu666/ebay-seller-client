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
 * A type that defines the fields used by the &lt;b&gt;Keyword&lt;/b&gt; method.
 */
@ApiModel(description = "A type that defines the fields used by the <b>Keyword</b> method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T14:51:10.412+08:00[Asia/Shanghai]")
public class KeywordRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_KEYWORD_TEXT = "keywordText";
  @SerializedName(SERIALIZED_NAME_KEYWORD_TEXT)
  private String keywordText;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "matchType";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private String matchType;


  public KeywordRequest keywordText(String keywordText) {
    
    this.keywordText = keywordText;
    return this;
  }

   /**
   * The text of the keyword. Keywords are not case sensitive and compound words can be used without additional encoding (for example, tennis ball).&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of characters: &lt;/b&gt;100 &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum number of words: &lt;/b&gt;10 
   * @return keywordText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text of the keyword. Keywords are not case sensitive and compound words can be used without additional encoding (for example, tennis ball).<br /><br /><b>Maximum number of characters: </b>100 <br /><br /><b>Maximum number of words: </b>10 ")

  public String getKeywordText() {
    return keywordText;
  }


  public void setKeywordText(String keywordText) {
    this.keywordText = keywordText;
  }


  public KeywordRequest matchType(String matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * A field that defines the match type for the keyword.&lt;br /&gt;&lt;br /&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;span style&#x3D;\&quot;color:#004680\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Broad matching of keywords is currently only supported in the AU marketplace.&lt;/span&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;BROAD&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;EXACT&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;PHRASE&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt; For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/marketing/types/pls:MatchTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt;
   * @return matchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A field that defines the match type for the keyword.<br /><br /><span class=\"tablenote\"><span style=\"color:#004680\"><strong>Note:</strong></span> Broad matching of keywords is currently only supported in the AU marketplace.</span><br /><b>Valid Values:</b><ul><li><code>BROAD</code></li><li><code>EXACT</code></li><li><code>PHRASE</code></li></ul> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/marketing/types/pls:MatchTypeEnum'>eBay API documentation</a>")

  public String getMatchType() {
    return matchType;
  }


  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordRequest keywordRequest = (KeywordRequest) o;
    return Objects.equals(this.keywordText, keywordRequest.keywordText) &&
        Objects.equals(this.matchType, keywordRequest.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordText, matchType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordRequest {\n");
    sb.append("    keywordText: ").append(toIndentedString(keywordText)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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


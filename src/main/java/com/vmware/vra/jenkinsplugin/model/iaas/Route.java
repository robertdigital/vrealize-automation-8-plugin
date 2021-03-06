/*
 * Copyright (c) 2020 VMware, Inc
 *
 *  SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * VMware Cloud Assembly IaaS API
 * A multi-cloud IaaS API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-01-15
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.iaas;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Route */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class Route {
  @SerializedName("path")
  private String path = null;

  @SerializedName("handler")
  private ConsumerOperation handler = null;

  /** Gets or Sets action */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    GET("GET"),
    POST("POST"),
    PATCH("PATCH"),
    PUT("PUT"),
    DELETE("DELETE"),
    OPTIONS("OPTIONS");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("description")
  private String description = null;

  /** Gets or Sets supportLevel */
  @JsonAdapter(SupportLevelEnum.Adapter.class)
  public enum SupportLevelEnum {
    NOT_SUPPORTED("NOT_SUPPORTED"),
    INTERNAL("INTERNAL"),
    DEPRECATED("DEPRECATED"),
    PUBLIC("PUBLIC");

    private String value;

    SupportLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SupportLevelEnum fromValue(String text) {
      for (SupportLevelEnum b : SupportLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SupportLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SupportLevelEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SupportLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SupportLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("supportLevel")
  private SupportLevelEnum supportLevel = null;

  @SerializedName("matcher")
  private PredicateOperation matcher = null;

  @SerializedName("parameters")
  private List<Parameter> parameters = null;

  public Route path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   *
   * @return path
   */
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Route handler(ConsumerOperation handler) {
    this.handler = handler;
    return this;
  }

  /**
   * Get handler
   *
   * @return handler
   */
  @Schema(description = "")
  public ConsumerOperation getHandler() {
    return handler;
  }

  public void setHandler(ConsumerOperation handler) {
    this.handler = handler;
  }

  public Route action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   *
   * @return action
   */
  @Schema(description = "")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public Route description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Route supportLevel(SupportLevelEnum supportLevel) {
    this.supportLevel = supportLevel;
    return this;
  }

  /**
   * Get supportLevel
   *
   * @return supportLevel
   */
  @Schema(description = "")
  public SupportLevelEnum getSupportLevel() {
    return supportLevel;
  }

  public void setSupportLevel(SupportLevelEnum supportLevel) {
    this.supportLevel = supportLevel;
  }

  public Route matcher(PredicateOperation matcher) {
    this.matcher = matcher;
    return this;
  }

  /**
   * Get matcher
   *
   * @return matcher
   */
  @Schema(description = "")
  public PredicateOperation getMatcher() {
    return matcher;
  }

  public void setMatcher(PredicateOperation matcher) {
    this.matcher = matcher;
  }

  public Route parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Route addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<Parameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   *
   * @return parameters
   */
  @Schema(description = "")
  public List<Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Route route = (Route) o;
    return Objects.equals(this.path, route.path)
        && Objects.equals(this.handler, route.handler)
        && Objects.equals(this.action, route.action)
        && Objects.equals(this.description, route.description)
        && Objects.equals(this.supportLevel, route.supportLevel)
        && Objects.equals(this.matcher, route.matcher)
        && Objects.equals(this.parameters, route.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, handler, action, description, supportLevel, matcher, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");

    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    supportLevel: ").append(toIndentedString(supportLevel)).append("\n");
    sb.append("    matcher: ").append(toIndentedString(matcher)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

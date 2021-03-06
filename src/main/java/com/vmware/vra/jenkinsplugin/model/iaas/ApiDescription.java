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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** ApiDescription */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class ApiDescription {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("deprecationPolicy")
  private DeprecationPolicy deprecationPolicy = null;

  @SerializedName("documentationLink")
  private String documentationLink = null;

  public ApiDescription apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The version of the API in yyyy-MM-dd format (UTC).
   *
   * @return apiVersion
   */
  @Schema(required = true, description = "The version of the API in yyyy-MM-dd format (UTC).")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ApiDescription deprecationPolicy(DeprecationPolicy deprecationPolicy) {
    this.deprecationPolicy = deprecationPolicy;
    return this;
  }

  /**
   * Get deprecationPolicy
   *
   * @return deprecationPolicy
   */
  @Schema(description = "")
  public DeprecationPolicy getDeprecationPolicy() {
    return deprecationPolicy;
  }

  public void setDeprecationPolicy(DeprecationPolicy deprecationPolicy) {
    this.deprecationPolicy = deprecationPolicy;
  }

  public ApiDescription documentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
    return this;
  }

  /**
   * The link to the documentation of this api version
   *
   * @return documentationLink
   */
  @Schema(required = true, description = "The link to the documentation of this api version")
  public String getDocumentationLink() {
    return documentationLink;
  }

  public void setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDescription apiDescription = (ApiDescription) o;
    return Objects.equals(this.apiVersion, apiDescription.apiVersion)
        && Objects.equals(this.deprecationPolicy, apiDescription.deprecationPolicy)
        && Objects.equals(this.documentationLink, apiDescription.documentationLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, deprecationPolicy, documentationLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDescription {\n");

    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    deprecationPolicy: ").append(toIndentedString(deprecationPolicy)).append("\n");
    sb.append("    documentationLink: ").append(toIndentedString(documentationLink)).append("\n");
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

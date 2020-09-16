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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Represents a network Profile.&lt;br&gt;**HATEOAS** links:&lt;br&gt;**fabric-networks** -
 * array[FabricNetwork] - Fabric networks defined in this profile.&lt;br&gt;**security-groups** -
 * array[SecurityGroup] - List of security groups for this profile.&lt;br&gt;**network-domains** -
 * array[NetworkDomain] - List of network domains for this
 * profile.&lt;br&gt;**isolated-external-fabric-networks** - array[FabricNetwork] - Isolated
 * external fabric networks in this profile.&lt;br&gt;**self** - NetowrkProfile - Self link to this
 * network profile
 */
@Schema(
    description =
        "Represents a network Profile.<br>**HATEOAS** links:<br>**fabric-networks** - array[FabricNetwork] - Fabric networks defined in this profile.<br>**security-groups** - array[SecurityGroup] - List of security groups for this profile.<br>**network-domains** - array[NetworkDomain] - List of network domains for this profile.<br>**isolated-external-fabric-networks** - array[FabricNetwork] - Isolated external fabric networks in this profile.<br>**self** - NetowrkProfile - Self link to this network profile")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class NetworkProfile {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("_links")
  private Map<String, Href> _links = new HashMap<String, Href>();

  @SerializedName("externalRegionId")
  private String externalRegionId = null;

  @SerializedName("cloudAccountId")
  private String cloudAccountId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isolationNetworkDomainCIDR")
  private String isolationNetworkDomainCIDR = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  /** Specifies the isolation type e.g. none, subnet or security group */
  @JsonAdapter(IsolationTypeEnum.Adapter.class)
  public enum IsolationTypeEnum {
    NONE("NONE"),
    SUBNET("SUBNET"),
    SECURITY_GROUP("SECURITY_GROUP");

    private String value;

    IsolationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsolationTypeEnum fromValue(String text) {
      for (IsolationTypeEnum b : IsolationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IsolationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsolationTypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsolationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IsolationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("isolationType")
  private IsolationTypeEnum isolationType = null;

  @SerializedName("isolatedNetworkCIDRPrefix")
  private Integer isolatedNetworkCIDRPrefix = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public NetworkProfile owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Email of the user that owns the entity.
   *
   * @return owner
   */
  @Schema(example = "csp@vmware.com", description = "Email of the user that owns the entity.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public NetworkProfile _links(Map<String, Href> _links) {
    this._links = _links;
    return this;
  }

  public NetworkProfile putLinksItem(String key, Href _linksItem) {
    this._links.put(key, _linksItem);
    return this;
  }

  /**
   * HATEOAS of the entity
   *
   * @return _links
   */
  @Schema(required = true, description = "HATEOAS of the entity")
  public Map<String, Href> getLinks() {
    return _links;
  }

  public void setLinks(Map<String, Href> _links) {
    this._links = _links;
  }

  public NetworkProfile externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

  /**
   * The id of the region for which this profile is defined
   *
   * @return externalRegionId
   */
  @Schema(
      example = "us-east-1",
      description = "The id of the region for which this profile is defined")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public NetworkProfile cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

  /**
   * Id of the cloud account this profile belongs to.
   *
   * @return cloudAccountId
   */
  @Schema(example = "[9e49]", description = "Id of the cloud account this profile belongs to.")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  public NetworkProfile description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-friendly description.
   *
   * @return description
   */
  @Schema(example = "my-description", description = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NetworkProfile isolationNetworkDomainCIDR(String isolationNetworkDomainCIDR) {
    this.isolationNetworkDomainCIDR = isolationNetworkDomainCIDR;
    return this;
  }

  /**
   * CIDR of the isolation network domain.
   *
   * @return isolationNetworkDomainCIDR
   */
  @Schema(description = "CIDR of the isolation network domain.")
  public String getIsolationNetworkDomainCIDR() {
    return isolationNetworkDomainCIDR;
  }

  public void setIsolationNetworkDomainCIDR(String isolationNetworkDomainCIDR) {
    this.isolationNetworkDomainCIDR = isolationNetworkDomainCIDR;
  }

  public NetworkProfile orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The id of the organization this entity belongs to.
   *
   * @return orgId
   */
  @Schema(example = "9.0E+49", description = "The id of the organization this entity belongs to.")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public NetworkProfile tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public NetworkProfile addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of tag keys and optional values that were set on this Network Profile.
   *
   * @return tags
   */
  @Schema(
      example = "[ { \"key\" : \"ownedBy\", \"value\": \"Rainpole\" } ]",
      description = "A set of tag keys and optional values that were set on this Network Profile.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public NetworkProfile organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.
   *
   * @return organizationId
   */
  @Schema(
      example = "deprecated",
      description =
          "This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public NetworkProfile createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date when the entity was created. The date is in ISO 8601 and UTC.
   *
   * @return createdAt
   */
  @Schema(
      example = "2012-09-27",
      description = "Date when the entity was created. The date is in ISO 8601 and UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public NetworkProfile customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public NetworkProfile putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Additional properties that may be used to extend the Network Profile object that is produced
   * from this specification. For isolationType security group, datastoreId identifies the Compute
   * Resource Edge datastore. computeCluster and resourcePoolId identify the Compute Resource Edge
   * cluster. For isolationType subnet, distributedLogicalRouterStateLink identifies the on-demand
   * network distributed local router. onDemandNetworkIPAssignmentType identifies the on-demand
   * network IP range assignment type static, dynamic, or mixed.
   *
   * @return customProperties
   */
  @Schema(
      example =
          "{ \"resourcePoolId\" : \"resource-pool-1\", \"datastoreId\" : \"StoragePod:group-p87839\", \"computeCluster\" : \"/resources/compute/1234\", \"distributedLogicalRouterStateLink\" : \"/resources/routers/1234\", \"onDemandNetworkIPAssignmentType\" : \"dynamic\"}",
      description =
          "Additional properties that may be used to extend the Network Profile object that is produced from this specification.  For isolationType security group, datastoreId identifies the Compute Resource Edge datastore. computeCluster and resourcePoolId identify the Compute Resource Edge cluster. For isolationType subnet, distributedLogicalRouterStateLink identifies the on-demand network distributed local router.  onDemandNetworkIPAssignmentType identifies the on-demand network IP range assignment type static, dynamic, or mixed.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public NetworkProfile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name used as an identifier in APIs that support this option.
   *
   * @return name
   */
  @Schema(
      example = "my-name",
      description = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetworkProfile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of this resource instance
   *
   * @return id
   */
  @Schema(example = "9.0E+49", required = true, description = "The id of this resource instance")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NetworkProfile isolationType(IsolationTypeEnum isolationType) {
    this.isolationType = isolationType;
    return this;
  }

  /**
   * Specifies the isolation type e.g. none, subnet or security group
   *
   * @return isolationType
   */
  @Schema(description = "Specifies the isolation type e.g. none, subnet or security group")
  public IsolationTypeEnum getIsolationType() {
    return isolationType;
  }

  public void setIsolationType(IsolationTypeEnum isolationType) {
    this.isolationType = isolationType;
  }

  public NetworkProfile isolatedNetworkCIDRPrefix(Integer isolatedNetworkCIDRPrefix) {
    this.isolatedNetworkCIDRPrefix = isolatedNetworkCIDRPrefix;
    return this;
  }

  /**
   * The CIDR prefix length to be used for the isolated networks that are created with the network
   * profile.
   *
   * @return isolatedNetworkCIDRPrefix
   */
  @Schema(
      description =
          "The CIDR prefix length to be used for the isolated networks that are created with the network profile.")
  public Integer getIsolatedNetworkCIDRPrefix() {
    return isolatedNetworkCIDRPrefix;
  }

  public void setIsolatedNetworkCIDRPrefix(Integer isolatedNetworkCIDRPrefix) {
    this.isolatedNetworkCIDRPrefix = isolatedNetworkCIDRPrefix;
  }

  public NetworkProfile updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date when the entity was last updated. The date is ISO 8601 and UTC.
   *
   * @return updatedAt
   */
  @Schema(
      example = "2012-09-27",
      description = "Date when the entity was last updated. The date is ISO 8601 and UTC.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkProfile networkProfile = (NetworkProfile) o;
    return Objects.equals(this.owner, networkProfile.owner)
        && Objects.equals(this._links, networkProfile._links)
        && Objects.equals(this.externalRegionId, networkProfile.externalRegionId)
        && Objects.equals(this.cloudAccountId, networkProfile.cloudAccountId)
        && Objects.equals(this.description, networkProfile.description)
        && Objects.equals(
            this.isolationNetworkDomainCIDR, networkProfile.isolationNetworkDomainCIDR)
        && Objects.equals(this.orgId, networkProfile.orgId)
        && Objects.equals(this.tags, networkProfile.tags)
        && Objects.equals(this.organizationId, networkProfile.organizationId)
        && Objects.equals(this.createdAt, networkProfile.createdAt)
        && Objects.equals(this.customProperties, networkProfile.customProperties)
        && Objects.equals(this.name, networkProfile.name)
        && Objects.equals(this.id, networkProfile.id)
        && Objects.equals(this.isolationType, networkProfile.isolationType)
        && Objects.equals(this.isolatedNetworkCIDRPrefix, networkProfile.isolatedNetworkCIDRPrefix)
        && Objects.equals(this.updatedAt, networkProfile.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        owner,
        _links,
        externalRegionId,
        cloudAccountId,
        description,
        isolationNetworkDomainCIDR,
        orgId,
        tags,
        organizationId,
        createdAt,
        customProperties,
        name,
        id,
        isolationType,
        isolatedNetworkCIDRPrefix,
        updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkProfile {\n");

    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isolationNetworkDomainCIDR: ")
        .append(toIndentedString(isolationNetworkDomainCIDR))
        .append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isolationType: ").append(toIndentedString(isolationType)).append("\n");
    sb.append("    isolatedNetworkCIDRPrefix: ")
        .append(toIndentedString(isolatedNetworkCIDRPrefix))
        .append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
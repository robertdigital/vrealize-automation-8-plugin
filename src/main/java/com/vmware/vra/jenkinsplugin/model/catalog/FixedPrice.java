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
 * VMware Service Broker API
 * A multi-cloud API for Cloud Automation Services
 *
 * OpenAPI spec version: 2020-08-25
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.catalog;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Objects;

/** FixedPrice */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class FixedPrice {
  /** Gets or Sets chargePeriod */
  @JsonAdapter(ChargePeriodEnum.Adapter.class)
  public enum ChargePeriodEnum {
    HOURLY("HOURLY"),
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    MONTHLY("MONTHLY");

    private String value;

    ChargePeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargePeriodEnum fromValue(String text) {
      for (ChargePeriodEnum b : ChargePeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChargePeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargePeriodEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargePeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChargePeriodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("chargePeriod")
  private ChargePeriodEnum chargePeriod = null;

  @SerializedName("rate")
  private Double rate = null;

  public FixedPrice chargePeriod(ChargePeriodEnum chargePeriod) {
    this.chargePeriod = chargePeriod;
    return this;
  }

  /**
   * Get chargePeriod
   *
   * @return chargePeriod
   */
  @Schema(description = "")
  public ChargePeriodEnum getChargePeriod() {
    return chargePeriod;
  }

  public void setChargePeriod(ChargePeriodEnum chargePeriod) {
    this.chargePeriod = chargePeriod;
  }

  public FixedPrice rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   *
   * @return rate
   */
  @Schema(description = "")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedPrice fixedPrice = (FixedPrice) o;
    return Objects.equals(this.chargePeriod, fixedPrice.chargePeriod)
        && Objects.equals(this.rate, fixedPrice.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargePeriod, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedPrice {\n");

    sb.append("    chargePeriod: ").append(toIndentedString(chargePeriod)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

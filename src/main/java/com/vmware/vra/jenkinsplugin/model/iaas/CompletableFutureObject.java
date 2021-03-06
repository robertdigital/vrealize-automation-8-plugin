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

/** CompletableFutureObject */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class CompletableFutureObject {
  @SerializedName("numberOfDependents")
  private Integer numberOfDependents = null;

  @SerializedName("cancelled")
  private Boolean cancelled = null;

  @SerializedName("completedExceptionally")
  private Boolean completedExceptionally = null;

  @SerializedName("done")
  private Boolean done = null;

  public CompletableFutureObject numberOfDependents(Integer numberOfDependents) {
    this.numberOfDependents = numberOfDependents;
    return this;
  }

  /**
   * Get numberOfDependents
   *
   * @return numberOfDependents
   */
  @Schema(description = "")
  public Integer getNumberOfDependents() {
    return numberOfDependents;
  }

  public void setNumberOfDependents(Integer numberOfDependents) {
    this.numberOfDependents = numberOfDependents;
  }

  public CompletableFutureObject cancelled(Boolean cancelled) {
    this.cancelled = cancelled;
    return this;
  }

  /**
   * Get cancelled
   *
   * @return cancelled
   */
  @Schema(description = "")
  public Boolean isCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public CompletableFutureObject completedExceptionally(Boolean completedExceptionally) {
    this.completedExceptionally = completedExceptionally;
    return this;
  }

  /**
   * Get completedExceptionally
   *
   * @return completedExceptionally
   */
  @Schema(description = "")
  public Boolean isCompletedExceptionally() {
    return completedExceptionally;
  }

  public void setCompletedExceptionally(Boolean completedExceptionally) {
    this.completedExceptionally = completedExceptionally;
  }

  public CompletableFutureObject done(Boolean done) {
    this.done = done;
    return this;
  }

  /**
   * Get done
   *
   * @return done
   */
  @Schema(description = "")
  public Boolean isDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletableFutureObject completableFutureObject = (CompletableFutureObject) o;
    return Objects.equals(this.numberOfDependents, completableFutureObject.numberOfDependents)
        && Objects.equals(this.cancelled, completableFutureObject.cancelled)
        && Objects.equals(
            this.completedExceptionally, completableFutureObject.completedExceptionally)
        && Objects.equals(this.done, completableFutureObject.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfDependents, cancelled, completedExceptionally, done);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletableFutureObject {\n");

    sb.append("    numberOfDependents: ").append(toIndentedString(numberOfDependents)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    completedExceptionally: ")
        .append(toIndentedString(completedExceptionally))
        .append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
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

/**
 * Copyright (C) 2012 - 2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
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
package com.xeiam.xchange.mtgox.v2.dto.trade.polling;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data object representing a response message from Mt Gox after placing and order
 */
public final class MtGoxGenericResponse {

  private final String result;
  private final Object data;
  private final String error;

  /**
   * Constructor
   * 
   * @param result
   * @param data
   * @param error
   */
  public MtGoxGenericResponse(@JsonProperty("result") String result, @JsonProperty("data") Object data, @JsonProperty("error") String error) {

    this.result = result;
    this.data = data;
    this.error = error;
  }

  public String getResult() {

    return result;
  }

  public Object getData() {

    return data;
  }

  public String getError() {

    return error;
  }

  public String getDataString() {

    return data == null ? null : data.toString();
  }

  @Override
  public String toString() {

    return "MtGoxGenericResponse [result=" + result + ", data=" + data + ", error=" + error + "]";
  }

}

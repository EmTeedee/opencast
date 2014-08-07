package org.opencastproject.execute.api;
/**
 *  Copyright 2009, 2010 The Regents of the University of California
 *  Licensed under the Educational Community License, Version 2.0
 *  (the "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at
 *
 *  http://www.osedu.org/licenses/ECL-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */

/**
 * The class for any exceptions related with the ExecuteService
 */
public class ExecuteException extends Exception {

	private static final long serialVersionUID = 1L;

/**
   * Constructs a new execute exception without a message or a cause.
   */
  public ExecuteException() {
  }

  /**
   * Constructs a new execute exception with a message.
   * 
   * @param message
   *          the message describing the exception
   */
  public ExecuteException(String message) {
    super(message);
  }

  /**
   * Constructs a new execute exception with the throwable causing this exception to be thrown.
   * 
   * @param cause
   *          the cause of this exception
   */
  public ExecuteException(Throwable cause) {
    super(cause);
  }

  /**
   * Constructs a new Execute exception with a message and the throwable that caused this exception to be
   * thrown.
   * 
   * @param message
   *          the message describing the exception
   * @param cause
   *          the cause of this exception
   */
  public ExecuteException(String message, Throwable cause) {
    super(message, cause);
  }
}

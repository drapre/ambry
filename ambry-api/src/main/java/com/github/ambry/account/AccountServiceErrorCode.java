/**
 * Copyright 2020 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.github.ambry.account;

/**
 * All the error codes that accompany a {@link AccountServiceException}.
 */
public enum AccountServiceErrorCode {
  /**
   * Account or container is not found in underlying metadata store.
   */
  NotFound,
  /**
   * Request has invalid arguments.
   */
  BadRequest,
  /**
   * There is a conflicting account or container.
   */
  ResourceConflict,
  /**
   * Error occurred when updating account in metadata store.
   */
  AccountUpdateError
}

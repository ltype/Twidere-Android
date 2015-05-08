/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mariotaku.twidere.api.twitter.model;

import java.util.Date;

public interface UserList extends Comparable<UserList>, TwitterResponse {
    Mode getMode();

    String getDescription();


    String getFullName();


    long getId();


    long getMemberCount();


    String getName();


    String getSlug();


    long getSubscriberCount();


    String getUri();


    User getUser();


    Date getCreatedAt();

    boolean isFollowing();

    enum Mode {
        PUBLIC("public"), PRIVATE("private");

        private final String mode;

        Mode(String mode) {
            this.mode = mode;
        }

        public static Mode parse(String str) {
            switch (str) {
                case "public":
                    return PUBLIC;
                case "private":
                    return PRIVATE;
            }
            throw new UnsupportedOperationException();
        }

        public String getMode() {
            return mode;
        }
    }
}
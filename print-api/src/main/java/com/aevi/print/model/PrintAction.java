/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aevi.print.model;

import com.aevi.print.json.JsonConverter;
import com.aevi.print.json.Jsonable;

public class PrintAction implements Jsonable {

    private String printerId;
    private String action;

    public PrintAction(String printerId, String action) {
        this.printerId = printerId;
        this.action = action;
    }

    public String getPrinterId() {
        return printerId;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toJson() {
        return JsonConverter.serialize(this);
    }

    public static PrintAction fromJson(String json) {
        return JsonConverter.deserialize(json, PrintAction.class);
    }
}

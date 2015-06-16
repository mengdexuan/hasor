/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
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
package net.hasor.rsf.center.startup;
import net.hasor.mvc.support.ControllerModule;
import net.hasor.mvc.support.LoadHellper;
import net.hasor.rsf.center.apis.web.Customer;
import net.hasor.rsf.center.apis.web.Heartbeat;
import net.hasor.rsf.center.apis.web.OffLine;
import net.hasor.rsf.center.apis.web.OnLine;
import net.hasor.rsf.center.apis.web.Provider;
import net.hasor.rsf.center.apis.web.UnService;
/**
 * WebMVC
 * @version : 2015年5月5日
 * @author 赵永春(zyc@hasor.net)
 */
public class ActionModule extends ControllerModule {
    @Override
    protected void loadController(LoadHellper helper) {
        helper.loadType(OffLine.class);
        helper.loadType(OnLine.class);
        helper.loadType(Customer.class);
        helper.loadType(Provider.class);
        helper.loadType(UnService.class);
        helper.loadType(Heartbeat.class);
    }
}
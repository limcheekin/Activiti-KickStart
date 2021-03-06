/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.activiti.kickstart.ui.listener;

import org.activiti.kickstart.ui.ViewManager;
import org.activiti.kickstart.ui.popup.FormPopupWindow;
import org.activiti.kickstart.model.TaskFormModel;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

/**
 * @author Joram Barrez
 */
public class ShowFormClickListener implements Button.ClickListener {

  private static final long serialVersionUID = 3881133002111623189L;

  protected ViewManager viewManager;
  protected TaskFormModel formModel;
  protected Object taskItemId;

  public ShowFormClickListener(ViewManager viewManager, TaskFormModel formModel, Object taskItemId) {
    this.viewManager = viewManager;
    this.formModel = formModel;
    this.taskItemId = taskItemId;
  }

  public void buttonClick(ClickEvent event) {
    viewManager.showPopupWindow(new FormPopupWindow(taskItemId, formModel));
  }

}

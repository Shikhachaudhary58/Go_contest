package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class itemtournament {
    public class GroupItem {
        private String groupName;

        public GroupItem(String groupName, List<ChildItem> childItems) {
            this.groupName = groupName;
            this.childItems = childItems;
        }

        private List<ChildItem> childItems;

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public List<ChildItem> getChildItems() {
            return childItems;
        }

        public void setChildItems(List<ChildItem> childItems) {
            this.childItems = childItems;
        }

        public boolean isExpanded() {
            return false;
        }

        public void setExpanded(boolean b) {
        }

        public boolean isGroup() {
            return false;
        }
// Constructor, getters, and setters
    }

    public class ChildItem {
        private String childName;

        public ChildItem(String childName) {
            this.childName = childName;
        }

        public String getChildName() {
            return childName;
        }

        public void setChildName(String childName) {
            this.childName = childName;
        }
// Constructor, getters, and setters
    }

}



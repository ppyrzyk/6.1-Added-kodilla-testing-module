package com.kodilla.testing.user;
    public class SimpleUser {

        final private String username;
        private String realName;

//        can be deleted??
        public SimpleUser(String username) {
            this.username = username;
        }
        public SimpleUser(String username, String realName) {
            this.username = username;
            this.realName = realName;
        }

        public String getUsername() {
            return username;
        }
        public String getRealName() {
            return realName;
        }
    }


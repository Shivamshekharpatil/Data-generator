public class LogInSignIn {
        private String email, password, username;
        public String getEmail() {return email;}

        public void newEmail (String email){this.email = email;}
        public String getPassword() {return password;}
        public void newPassword(String password) {this.password = password;}
        public String getUsername() {return username;}
        public void newUsername (String username) {this.username = username;}

        public LogInSignIn(String email, String password, String username){
            this.email = email;
            this.password = password;
            this.username = username;
        }

    }


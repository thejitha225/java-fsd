package com.simplilearn.demo;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {

	///id, feedback,user_email,date///
        private long ID;
        private String name;
        private String feedback;
        private Date dateAdded;  
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public String getfeedback() { return this.feedback;}
        public Date getDateAdded() { return this.dateAdded;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setfeedback(String feedback) { this.feedback = feedback;}
        public void setDateAdded(Date dateAdded) { this.dateAdded = dateAdded;}
		@Override
		public String toString() {
			return "EProductEntity [ID=" + ID + ", name=" + name + ", feedback=" + feedback + ", dateAdded=" + dateAdded
					+ "]";
		} 
        
        
}
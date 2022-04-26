package io.github.schreddo.nerdy.clickup.api.models;

import com.google.gson.annotations.SerializedName;

import io.github.schreddo.nerdy.clickup.api.enums.UserRole;
import io.github.schreddo.nerdy.clickup.api.enums.WeekStartDay;

public class CUUser {
	
	@SerializedName("id")
	private Long id;
	@SerializedName("username")
	private String username;
	@SerializedName("email")
	private String email;
	@SerializedName("color")
	private String color;
	@SerializedName("profilePicture")
	private String profilePicture;
	@SerializedName("initials")
	private String initials;
	@SerializedName("role")
	private Integer role;
	@SerializedName("week_start_day")
	private Integer weekStartDay;
	@SerializedName("global_font_support")
	private Boolean globalFontSupport;
	@SerializedName("admin")
	private Boolean asAdmin;
	
	public Long getID() {
		return id;
	}
	public void setID(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public UserRole getRole() {
		return UserRole.valueOf(this.role);
	}
	public void setRole(UserRole role) {
		this.role = role.value();
	}
	public WeekStartDay getWeekStartDay() {
		return WeekStartDay.valueOf(this.weekStartDay);
	}
	public void setWeekStartDay(WeekStartDay weekStartDay) {
		this.weekStartDay = weekStartDay.value();
	}
	public Boolean getGlobalFontSupport() {
		return globalFontSupport;
	}
	public void setGlobalFontSupport(Boolean globalFontSupport) {
		this.globalFontSupport = globalFontSupport;
	}
	public Boolean getAsAdmin() {
		return asAdmin;
	}
	public void setAsAdmin(Boolean asAdmin) {
		this.asAdmin = asAdmin;
	}
	
	public CUUser() {
		
	}
}

package com.test.demo.vo;

public class EmployeeVO {
	private int empNo;			// 사번
	
	private String empName;		// 사원명
	
	private String empAddr;		// 사원 주소
	
	private int empAge;			// 사원 나이

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "EmployeeVO [empNo=" + empNo + ", empName=" + empName + ", empAddr=" + empAddr + ", empAge=" + empAge
				+ "]";
	}
}

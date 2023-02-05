package com.vti.entity;
import com.vti.entity.Position.Pname;
public class Position {
	public int id;
	
	// có thể tạo enum từ tạo enum file trong mục entity
		public enum Pname {
			Dev, Test, Scrum_Master, PM
		}

		public Pname name;
}

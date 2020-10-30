package com.vm.dao;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vm.dto.VidDto;
import com.vm.util.DBConnection;

import retriever.retriveVid;

public class VidDao {
	
	private final String GET_DATA = "select id,fileName from content";
	private final String GET_VIDEO = "select file from content where id=?";
	
	Connection con = null;
	PreparedStatement ps =null;
	ResultSet rs = null;
	
	public List<VidDto> getData(){
		VidDto vidDto = null;
		
		List<VidDto> vidList = new ArrayList<VidDto>();
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(GET_DATA);
			rs = ps.executeQuery();
			while(rs.next()) {
				vidDto = new VidDto();
				String id = rs.getString(1);
				vidDto.setId(rs.getString(1));
				vidDto.setFileName(rs.getString(2));
				vidList.add(vidDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vidList;
	}
	
	public byte[] getVideo(String id){
		
		byte[] video = null;
		
		
		try {
			
			con = DBConnection.getConnection();
			ps = con.prepareStatement(GET_VIDEO);
			ps.setString(1, id);
			rs= ps.executeQuery();
			
			if(rs.next()) {
				
			video =	rs.getBytes(1);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return video;
	}
}

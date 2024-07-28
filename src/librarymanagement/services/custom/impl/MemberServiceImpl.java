/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.services.custom.impl;

import java.util.List;
import librarymanagement.dao.DaoFactory;
import librarymanagement.dao.custome.MemberDao;
import librarymanagement.dto.MemberDto;
import librarymanagement.entity.MemberEntity;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.custom.MemberService;

/**
 *
 * @author ayesh
 */
public class MemberServiceImpl implements MemberService{
    
    private MemberDao memberDao = (MemberDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.MEMBER);
    

    @Override
    public String saveMember(MemberDto dto) throws Exception{
        
      boolean isMemberCreated=  memberDao.create(membeDtoToEntity(dto));
      
//      if(isMemberCreated){
//          
//      }
    
      return isMemberCreated? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    @Override
    public String updateMember(MemberDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String deleteMember(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MemberDto getMemberById(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MemberDto> getMemberList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    private MemberEntity membeDtoToEntity(MemberDto dto){
    
      return new MemberEntity(0, dto.getMemberId(), dto.getLastName(), dto.getFirstName(), dto.getAge(),
              dto.getAddress());
    }
}

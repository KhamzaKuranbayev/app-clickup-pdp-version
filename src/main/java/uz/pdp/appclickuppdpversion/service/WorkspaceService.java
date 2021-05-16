package uz.pdp.appclickuppdpversion.service;


import uz.pdp.appclickuppdpversion.entity.User;
import uz.pdp.appclickuppdpversion.payload.ApiResponse;
import uz.pdp.appclickuppdpversion.payload.MemberDTO;
import uz.pdp.appclickuppdpversion.payload.WorkspaceDTO;

import java.util.List;
import java.util.UUID;


public interface WorkspaceService {

    ApiResponse addWorkspace(WorkspaceDTO workspaceDTO, User user);

    ApiResponse editWorkspace(WorkspaceDTO workspaceDTO);

    ApiResponse changeOwnerWorkspace(Long id, UUID ownerId);

    ApiResponse deleteWorkspace(Long id);

    ApiResponse addOrEditOrRemoveWorkspace(Long id, MemberDTO memberDTO);

    ApiResponse joinToWorkspace(Long id, User user);

    List<MemberDTO> getMemberAndGuest(Long id);
}

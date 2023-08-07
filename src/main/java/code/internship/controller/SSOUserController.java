package code.internship.controller;

import code.internship.entity.SSOUserEntity;
import code.internship.model.SSOUserModel;
import code.internship.response.ApiResponse;
import code.internship.response.ResponseData;
import code.internship.service.SSOUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apitest")
public class SSOUserController {

    @Autowired
    private SSOUserService ssoUserService;

    @PostMapping("/gentoken")
    public ResponseEntity<?> createSsoUser(@RequestBody SSOUserModel ssoUserModel) {
        try {
            SSOUserEntity savedSsoUser = ssoUserService.insert(ssoUserModel);
            return ResponseEntity.ok(createSuccessResponse(savedSsoUser.getUserId(), savedSsoUser.getTokenId()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                 .body(createErrorResponse(ssoUserModel));
        }
    }



    private Object createSuccessResponse(String userId, String tokenId) {
        return new ApiResponse("I07000", "ทำรายการเรียบร้อย", new ResponseData(userId, tokenId));
    }

    private Object createErrorResponse(SSOUserModel ssoUserModel) {
        return new ApiResponse("E000001", "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้", 
                               new ResponseData(ssoUserModel.getUserId(), ""));
    }



}

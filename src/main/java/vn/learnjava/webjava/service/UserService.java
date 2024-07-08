package vn.learnjava.webjava.service;

import vn.learnjava.webjava.dto.request.UserRequestDTO;
import vn.learnjava.webjava.dto.response.PageResponse;
import vn.learnjava.webjava.dto.response.UserDetailResponse;
import vn.learnjava.webjava.util.UserStatus;

public interface UserService {

    long saveUser(UserRequestDTO request);

    void updateUser(long userId, UserRequestDTO request);

    void changeStatus(long userId, UserStatus status);

    void deleteUser(long userId);

    UserDetailResponse getUser(long userId);

    PageResponse<?> getAllUsersWithSortByMultipleColumns(int pageNo, int pageSize, String... sorts);

    PageResponse getAllUsersWithSortBy(int pageNo, int pageSize, String sortBy);

    PageResponse<?> getAllUsersWithSortByColumnAndSearch(int pageNo, int pageSize, String search, String sortBy);

}

package com.example.board.repository;

import com.example.board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member, String> {

    @Query(value="select * from member where id = ? and password = ?", nativeQuery = true)
    public Member findIdAndPassword(String id, String password);
}

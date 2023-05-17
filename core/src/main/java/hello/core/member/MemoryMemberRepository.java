package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);//put으로 member 추가하기
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId); // id로 member 값 가져오기
    }
}

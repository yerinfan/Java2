package java0927;

class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySQL DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySQL DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySQL DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB에서 삭제");
	}
}
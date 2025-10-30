import type { UserEntity } from "../domain/User/entity_User.ts";
import { v4 } from "uuid";

class UserRepositoryMemory {
  private users: UserEntity[] = [];

  findAll(): UserEntity[] {
    return this.users;
  }

  findById(id: string): UserEntity | undefined {
    return this.users.find((user) => user.id === id);
  }

  findByCpf(cpf: string): UserEntity | undefined {
    return this.users.find((user) => user.cpf === cpf);
  }

  create(user: UserEntity): UserEntity {
    const id = v4();
    user.id = id;
    user.books = [];
    this.users.push(user);
    return user;
  }

  update(id: string, updatedUser: UserEntity): UserEntity | undefined {
    const user = this.findById(id);
    if (user) {
      user.name = updatedUser.name;
      user.cpf = updatedUser.cpf;
    }
    return user;
  }

  delete(id: string): number {
    const index = this.users.findIndex((user) => user.id === id);
    if (index < 0) {
      return index;
    }
    this.users.splice(index, 1);
    return index;
  }
}
export default new UserRepositoryMemory();

import type { BookEntity } from "../Book/entity_Book.ts";

export type UserEntity = {
  id?:string;
  name:string;
  cpf:string;
  books?:BookEntity[];
}
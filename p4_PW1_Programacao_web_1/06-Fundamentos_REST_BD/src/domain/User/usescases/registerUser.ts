// importações
import type {UserEnity} from "./entity_User.ts"
import x from "../../"
import userRepositoryMemory from "../../../repositories/userRepositoryMemory.ts"

class RegisterUser_UserCase {
    execute(name: string, cpf: string) {
        let userExist = userRepositoryMemory.findByCpf(user.cpf);

        if (userExist) {
            return {message: "cliente já existe no Banco de Dados."}
        }

        const userCreated = userRepositoryMemory.create(user);
        return {user:userCreated}
    }
}

export default new RegisterUser_UserCase
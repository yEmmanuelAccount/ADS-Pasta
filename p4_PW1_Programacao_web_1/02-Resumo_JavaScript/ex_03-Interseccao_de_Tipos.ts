type UserType = {
    id: number; // parâmetro igual
    nome: string;
    idade: number;
    email: string;
    salario?: number;
    city?: string;
    cep?: string;
};

type ProfissionType = {
    id: string; // parâmetro igual
    tipo:string;
    salario:number;
}

type TeacherType = UserType & ProfissionType; // use & (para aceitar mais de um tipo para um mesmo parâmetro)ou | (para aceitar um ou outro tipo para um mesmo parâmetro)
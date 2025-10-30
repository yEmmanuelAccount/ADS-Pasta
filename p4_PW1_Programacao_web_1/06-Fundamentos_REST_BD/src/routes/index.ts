import { Router } from "express";
import { usersRoutes } from "../routes/user.routes.ts";

const routes = Router();

routes.use(usersRoutes);

export { routes };
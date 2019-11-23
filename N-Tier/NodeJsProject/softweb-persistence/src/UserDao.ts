import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity()
export class UserDao {

    @Column({name: "Id"})
    @PrimaryGeneratedColumn()
    id: number;

    @Column({name: "FirstName"})
    firstName: string;

    @Column({name: "LastName"})
    lastName: string;

}
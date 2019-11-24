unit UserService;

interface

uses UserDto, System.Generics.Collections;

type
   IUserService =  interface(IInterface)
      function GetUsers(): TList<TUserDto>;
      function multipl(x:Integer ; y:Integer):Integer;
   end;
implementation

end.

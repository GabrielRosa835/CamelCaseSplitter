string example = "";
string[] output = null;
while (example != "exit")
{
    Console.Clear();
    Console.WriteLine("Digite um texto (\"exit\" para sair): ");
    example = Console.ReadLine();
    if (example != null && example != "exit")
    {
        output = Splitter.Split(example);
        Console.Write("Resultado: ");
        for (int i = 0; i < output.Length - 1; i++)
        {
            Console.Write("\"" + output[i] + "\", ");
        }
        Console.Write("\"" + output.Last() + "\"");
        Console.ReadLine();
    }

}

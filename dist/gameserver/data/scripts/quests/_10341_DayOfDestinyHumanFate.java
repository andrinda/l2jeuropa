package quests;

import lineage2.gameserver.model.base.Race;
import lineage2.gameserver.scripts.ScriptFile;

public class _10341_DayOfDestinyHumanFate extends SagasSuperclass implements ScriptFile 
{
	@Override
	public void onLoad()
	{
	}

	@Override
	public void onReload()
	{
	}

	@Override
	public void onShutdown()
	{
	}

	public _10341_DayOfDestinyHumanFate()
	{
		super(false);

		StartNPC = 30857;
		StartRace = Race.human;

		init();
	}
}

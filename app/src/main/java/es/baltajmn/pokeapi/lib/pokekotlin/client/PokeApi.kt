package es.baltajmn.pokeapi.lib.pokekotlin.client

import es.baltajmn.pokeapi.lib.pokekotlin.model.Ability
import es.baltajmn.pokeapi.lib.pokekotlin.model.ApiResourceList
import es.baltajmn.pokeapi.lib.pokekotlin.model.Berry
import es.baltajmn.pokeapi.lib.pokekotlin.model.BerryFirmness
import es.baltajmn.pokeapi.lib.pokekotlin.model.BerryFlavor
import es.baltajmn.pokeapi.lib.pokekotlin.model.Characteristic
import es.baltajmn.pokeapi.lib.pokekotlin.model.ContestEffect
import es.baltajmn.pokeapi.lib.pokekotlin.model.ContestType
import es.baltajmn.pokeapi.lib.pokekotlin.model.EggGroup
import es.baltajmn.pokeapi.lib.pokekotlin.model.EncounterCondition
import es.baltajmn.pokeapi.lib.pokekotlin.model.EncounterConditionValue
import es.baltajmn.pokeapi.lib.pokekotlin.model.EncounterMethod
import es.baltajmn.pokeapi.lib.pokekotlin.model.EvolutionChain
import es.baltajmn.pokeapi.lib.pokekotlin.model.EvolutionTrigger
import es.baltajmn.pokeapi.lib.pokekotlin.model.Gender
import es.baltajmn.pokeapi.lib.pokekotlin.model.Generation
import es.baltajmn.pokeapi.lib.pokekotlin.model.GrowthRate
import es.baltajmn.pokeapi.lib.pokekotlin.model.Item
import es.baltajmn.pokeapi.lib.pokekotlin.model.ItemAttribute
import es.baltajmn.pokeapi.lib.pokekotlin.model.ItemCategory
import es.baltajmn.pokeapi.lib.pokekotlin.model.ItemFlingEffect
import es.baltajmn.pokeapi.lib.pokekotlin.model.ItemPocket
import es.baltajmn.pokeapi.lib.pokekotlin.model.Language
import es.baltajmn.pokeapi.lib.pokekotlin.model.Location
import es.baltajmn.pokeapi.lib.pokekotlin.model.LocationArea
import es.baltajmn.pokeapi.lib.pokekotlin.model.LocationAreaEncounter
import es.baltajmn.pokeapi.lib.pokekotlin.model.Machine
import es.baltajmn.pokeapi.lib.pokekotlin.model.Move
import es.baltajmn.pokeapi.lib.pokekotlin.model.MoveAilment
import es.baltajmn.pokeapi.lib.pokekotlin.model.MoveBattleStyle
import es.baltajmn.pokeapi.lib.pokekotlin.model.MoveCategory
import es.baltajmn.pokeapi.lib.pokekotlin.model.MoveDamageClass
import es.baltajmn.pokeapi.lib.pokekotlin.model.MoveLearnMethod
import es.baltajmn.pokeapi.lib.pokekotlin.model.MoveTarget
import es.baltajmn.pokeapi.lib.pokekotlin.model.NamedApiResourceList
import es.baltajmn.pokeapi.lib.pokekotlin.model.Nature
import es.baltajmn.pokeapi.lib.pokekotlin.model.PalParkArea
import es.baltajmn.pokeapi.lib.pokekotlin.model.PokeathlonStat
import es.baltajmn.pokeapi.lib.pokekotlin.model.Pokedex
import es.baltajmn.pokeapi.lib.pokekotlin.model.Pokemon
import es.baltajmn.pokeapi.lib.pokekotlin.model.PokemonColor
import es.baltajmn.pokeapi.lib.pokekotlin.model.PokemonForm
import es.baltajmn.pokeapi.lib.pokekotlin.model.PokemonHabitat
import es.baltajmn.pokeapi.lib.pokekotlin.model.PokemonShape
import es.baltajmn.pokeapi.lib.pokekotlin.model.PokemonSpecies
import es.baltajmn.pokeapi.lib.pokekotlin.model.Region
import es.baltajmn.pokeapi.lib.pokekotlin.model.Stat
import es.baltajmn.pokeapi.lib.pokekotlin.model.SuperContestEffect
import es.baltajmn.pokeapi.lib.pokekotlin.model.Type
import es.baltajmn.pokeapi.lib.pokekotlin.model.Version
import es.baltajmn.pokeapi.lib.pokekotlin.model.VersionGroup

interface PokeApi {

    fun getBerryList(offset: Int, limit: Int): NamedApiResourceList

    fun getBerryFirmnessList(offset: Int, limit: Int): NamedApiResourceList

    fun getBerryFlavorList(offset: Int, limit: Int): NamedApiResourceList

    fun getContestTypeList(offset: Int, limit: Int): NamedApiResourceList

    fun getContestEffectList(offset: Int, limit: Int): ApiResourceList

    fun getSuperContestEffectList(offset: Int, limit: Int): ApiResourceList

    fun getEncounterMethodList(offset: Int, limit: Int): NamedApiResourceList

    fun getEncounterConditionList(offset: Int, limit: Int): NamedApiResourceList

    fun getEncounterConditionValueList(offset: Int, limit: Int): NamedApiResourceList

    fun getEvolutionChainList(offset: Int, limit: Int): ApiResourceList

    fun getEvolutionTriggerList(offset: Int, limit: Int): NamedApiResourceList

    fun getGenerationList(offset: Int, limit: Int): NamedApiResourceList

    fun getPokedexList(offset: Int, limit: Int): NamedApiResourceList

    fun getVersionList(offset: Int, limit: Int): NamedApiResourceList

    fun getVersionGroupList(offset: Int, limit: Int): NamedApiResourceList

    fun getItemList(offset: Int, limit: Int): NamedApiResourceList

    fun getItemAttributeList(offset: Int, limit: Int): NamedApiResourceList

    fun getItemCategoryList(offset: Int, limit: Int): NamedApiResourceList

    fun getItemFlingEffectList(offset: Int, limit: Int): NamedApiResourceList

    fun getItemPocketList(offset: Int, limit: Int): NamedApiResourceList

    fun getMoveList(offset: Int, limit: Int): NamedApiResourceList

    fun getMoveAilmentList(offset: Int, limit: Int): NamedApiResourceList

    fun getMoveBattleStyleList(offset: Int, limit: Int): NamedApiResourceList

    fun getMoveCategoryList(offset: Int, limit: Int): NamedApiResourceList

    fun getMoveDamageClassList(offset: Int, limit: Int): NamedApiResourceList

    fun getMoveLearnMethodList(offset: Int, limit: Int): NamedApiResourceList

    fun getMoveTargetList(offset: Int, limit: Int): NamedApiResourceList

    fun getLocationList(offset: Int, limit: Int): NamedApiResourceList

    fun getLocationAreaList(offset: Int, limit: Int): NamedApiResourceList

    fun getPalParkAreaList(offset: Int, limit: Int): NamedApiResourceList

    fun getRegionList(offset: Int, limit: Int): NamedApiResourceList

    fun getMachineList(offset: Int, limit: Int): ApiResourceList

    fun getAbilityList(offset: Int, limit: Int): NamedApiResourceList

    fun getCharacteristicList(offset: Int, limit: Int): ApiResourceList

    fun getEggGroupList(offset: Int, limit: Int): NamedApiResourceList

    fun getGenderList(offset: Int, limit: Int): NamedApiResourceList

    fun getGrowthRateList(offset: Int, limit: Int): NamedApiResourceList

    fun getNatureList(offset: Int, limit: Int): NamedApiResourceList

    fun getPokeathlonStatList(offset: Int, limit: Int): NamedApiResourceList

    fun getPokemonList(offset: Int, limit: Int): NamedApiResourceList

    fun getPokemonColorList(offset: Int, limit: Int): NamedApiResourceList

    fun getPokemonFormList(offset: Int, limit: Int): NamedApiResourceList

    fun getPokemonHabitatList(offset: Int, limit: Int): NamedApiResourceList

    fun getPokemonShapeList(offset: Int, limit: Int): NamedApiResourceList

    fun getPokemonSpeciesList(offset: Int, limit: Int): NamedApiResourceList

    fun getStatList(offset: Int, limit: Int): NamedApiResourceList

    fun getTypeList(offset: Int, limit: Int): NamedApiResourceList

    fun getLanguageList(offset: Int, limit: Int): NamedApiResourceList

    fun getBerry(id: Int): Berry

    fun getBerryFirmness(id: Int): BerryFirmness

    fun getBerryFlavor(id: Int): BerryFlavor

    fun getContestType(id: Int): ContestType

    fun getContestEffect(id: Int): ContestEffect

    fun getSuperContestEffect(id: Int): SuperContestEffect

    fun getEncounterMethod(id: Int): EncounterMethod

    fun getEncounterCondition(id: Int): EncounterCondition

    fun getEncounterConditionValue(id: Int): EncounterConditionValue

    fun getEvolutionChain(id: Int): EvolutionChain

    fun getEvolutionTrigger(id: Int): EvolutionTrigger

    fun getGeneration(id: Int): Generation

    fun getPokedex(id: Int): Pokedex

    fun getVersion(id: Int): Version

    fun getVersionGroup(id: Int): VersionGroup

    fun getItem(id: Int): Item

    fun getItemAttribute(id: Int): ItemAttribute

    fun getItemCategory(id: Int): ItemCategory

    fun getItemFlingEffect(id: Int): ItemFlingEffect

    fun getItemPocket(id: Int): ItemPocket

    fun getMove(id: Int): Move

    fun getMoveAilment(id: Int): MoveAilment

    fun getMoveBattleStyle(id: Int): MoveBattleStyle

    fun getMoveCategory(id: Int): MoveCategory

    fun getMoveDamageClass(id: Int): MoveDamageClass

    fun getMoveLearnMethod(id: Int): MoveLearnMethod

    fun getMoveTarget(id: Int): MoveTarget

    fun getLocation(id: Int): Location

    fun getLocationArea(id: Int): LocationArea

    fun getPalParkArea(id: Int): PalParkArea

    fun getRegion(id: Int): Region

    fun getMachine(id: Int): Machine

    fun getAbility(id: Int): Ability

    fun getCharacteristic(id: Int): Characteristic

    fun getEggGroup(id: Int): EggGroup

    fun getGender(id: Int): Gender

    fun getGrowthRate(id: Int): GrowthRate

    fun getNature(id: Int): Nature

    fun getPokeathlonStat(id: Int): PokeathlonStat

    fun getPokemon(id: Int): Pokemon

    fun getPokemonEncounterList(id: Int): List<LocationAreaEncounter>

    fun getPokemonColor(id: Int): PokemonColor

    fun getPokemonForm(id: Int): PokemonForm

    fun getPokemonHabitat(id: Int): PokemonHabitat

    fun getPokemonShape(id: Int): PokemonShape

    fun getPokemonSpecies(id: Int): PokemonSpecies

    fun getStat(id: Int): Stat

    fun getType(id: Int): Type

    fun getLanguage(id: Int): Language
}

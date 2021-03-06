package com.thenewboston.utils.mapper

import com.thenewboston.utils.Mocks
import com.thenewboston.utils.PaginationOptions
import com.thenewboston.utils.Some
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object PrimaryValidatorAPIJsonMapper {

    const val ACCOUNTS_ENDPOINT = "accounts"
    const val ACCOUNT_BALANCE_ENDPOINT = ACCOUNTS_ENDPOINT
        .plus("/" + Some.accountNumber + "/balance")
    const val ACCOUNT_BALANCE_LOCK_ENDPOINT = ACCOUNTS_ENDPOINT
        .plus("/" + Some.accountNumber + "/balance_lock")
    const val BANK_BLOCKS_ENDPOINT = "bank_blocks"
    const val BANKS_ENDPOINT = "banks"
    const val SINGLE_BANKS_ENDPOINT = "banks"
        .plus("/d5356888dc9303e44ce52b1e06c3165a7759b9df1e6a6dfbd33ee1c3df1ab4d1")
    const val CONFIG_ENDPOINT = "config"
    const val CONFIRMATION_BLOCKS = "confirmation_blocks"
    const val CONNECTION_REQUESTS_ENDPOINT = "connection_requests"
    const val VALIDATORS_ENDPOINT = "validators"
    const val SINGLE_VALIDATOR_ENDPOINT = VALIDATORS_ENDPOINT
        .plus("/6871913581c3e689c9f39853a77e7263a96fd38596e9139f40a367e28364da53")
    const val CONFIRMATION_BLOCKS_ENDPOINT = CONFIRMATION_BLOCKS.plus("/${Some.blockIdentifier}/valid")

    fun mapBankFromValidatorToJson(): String {
        return Json.encodeToString(Mocks.bankFromValidator())
    }

    fun mapEmptyBankFromValidatorToJson(): String = Json.encodeToString(Mocks.emptyBankFromValidator())

    fun mapBanksFromValidatorToJson(offset: Int?, limit: Int?): String {
        return Json.encodeToString(Mocks.banksFromValidator(PaginationOptions(offset, limit)))
    }

    fun mapEmptyBanksFromValidatorToJson(): String = Json.encodeToString(Mocks.emptyBanksFromValidator())

    fun mapValidatorDetailsToJson(): String = Json.encodeToString(Mocks.validatorDetails("PRIMARY_VALIDATOR"))

    fun mapEmptyValidatorDetailsToJson(): String = Json.encodeToString(Mocks.emptyValidatorDetails())

    fun mapAccountsFromValidatorToJson(offset: Int?, limit: Int?): String =
        Json.encodeToString(Mocks.accountsFromValidator(PaginationOptions(offset, limit)))

    fun mapEmptyAccountsFromValidatorToJson(): String = Json.encodeToString(Mocks.emptyAccountsFromValidator())

    fun mapAccountBalanceToJson(): String = Json.encodeToString(Mocks.accountBalance())

    fun mapEmptyAccountBalanceToJson(): String = Json.encodeToString(Mocks.emptyAccountBalance())

    fun mapAccountBalanceLockToJson(): String = Json.encodeToString(Mocks.accountBalanceLock())

    fun mapEmptyAccountBalanceLockToJson(): String = Json.encodeToString(Mocks.emptyAccountBalanceLock())

    fun mapValidatorsToJson(offset: Int?, limit: Int?): String {
        return Json.encodeToString(Mocks.validators(PaginationOptions(offset, limit)))
    }

    fun mapEmptyValidatorsToJson(): String = Json.encodeToString(Mocks.emptyValidators())

    fun mapValidatorToJson(): String = Json.encodeToString(Mocks.validator())

    fun mapEmptyValidatorToJson(): String = Json.encodeToString(Mocks.emptyValidator())

    fun mapInternalServerErrorToJson(): String = Json.encodeToString(Mocks.internalServerError())

    fun mapConfirmationBlocksToJson(): String = Json.encodeToString(Mocks.confirmationBlocks())

    fun mapBankBlockToJson(): String = Json.encodeToString(Mocks.bankBlock())

    fun mapEmptyBankBlockToJson(): String = Json.encodeToString(Mocks.emptyBankBlock())
}
